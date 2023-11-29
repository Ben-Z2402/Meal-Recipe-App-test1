package use_case.Signup;
import entity.UserProfile;
import entity.UserProfileFactory;
import use_case.Signup.SignupInputBoundary;
import use_case.Signup.SignupInputData;
import use_case.Signup.SignupUserDataAccessInterface;

import java.time.LocalDateTime;

public class SignupInteractor implements SignupInputBoundary {
    final SignupUserDataAccessInterface userDataAccessObject;
    final SignupOutputBoundary userPresenter;
    final UserProfileFactory userFactory;

    public SignupInteractor(SignupUserDataAccessInterface signupDataAccessInterface,
                            SignupOutputBoundary signupOutputBoundary,
                            UserProfileFactory userFactory) {
        this.userDataAccessObject = signupDataAccessInterface;
        this.userPresenter = signupOutputBoundary;
        this.userFactory = userFactory;
    }

    @Override
    public void execute(SignupInputData signupInputData) {
        if (userDataAccessObject.existsByName(signupInputData.getUsername())) {
            userPresenter.prepareFailView("User already exists.");
        } else if (!signupInputData.getPassword().equals(signupInputData.getRepeatPassword())) {
            userPresenter.prepareFailView("Passwords don't match.");
        } else {

            LocalDateTime now = LocalDateTime.now();
            UserProfile user = userFactory.create(signupInputData.getUsername(), signupInputData.getPassword(), now);
            userDataAccessObject.save(user);

            SignupOutputData signupOutputData = new SignupOutputData(user.getName(), now.toString(), false);
            userPresenter.prepareSuccessView(signupOutputData);
        }
    }
}