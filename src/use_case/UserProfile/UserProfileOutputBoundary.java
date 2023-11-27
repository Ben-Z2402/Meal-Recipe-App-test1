package use_case.UserProfile;

public interface UserProfileOutputBoundary {
    void prepareSuccessView(UserProfileOutputData user);

    void prepareFailView(String error);
}
