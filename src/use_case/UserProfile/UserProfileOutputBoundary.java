package use_case.UserProfile;

public class UserProfileOutputBoundary {
    void prepareSuccessView(UserProfileOutputData user);

    void prepareFailView(String error);
}
