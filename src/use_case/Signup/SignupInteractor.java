package use_case.Signup;
import entity.UserProfile;
import entity.UserProfileFactory;
import use_case.Signup.SignupInputBoundary;
import use_case.Signup.SignupInputData;
import use_case.Signup.SignupUserDataAccessInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
        String username = signupInputData.getUsername();
        String password = signupInputData.getPassword();
        String repeatPassword = signupInputData.getRepeatPassword();
        float weight = signupInputData.getWeight();
        float height = signupInputData.getHeight();
        int age = signupInputData.getAge();
        ArrayList<String> dietaryRestrictions = signupInputData.getDietaryRestrictions();
        float weeklyBudget = signupInputData.getWeeklyBudget();
        int recommendedDailyCalories = signupInputData.getRecommendedDailyCalories();

        if (userDataAccessObject.existsByName(username)) {
            userPresenter.prepareFailView("User already exists.");
        } else if (!signupInputData.getPassword().equals(repeatPassword)) {
            userPresenter.prepareFailView("Passwords don't match.");
        } else {
            // check that the passwords are equal.
            assert (password.equals(repeatPassword));
            UserProfile user = userFactory.create(username, password, weight, height, age, dietaryRestrictions,
                    weeklyBudget, recommendedDailyCalories);
            userDataAccessObject.save(user);

            SignupOutputData signupOutputData = new SignupOutputData(user.getName(), now.toString(), false);
            userPresenter.prepareSuccessView(signupOutputData);
        }
    }
}