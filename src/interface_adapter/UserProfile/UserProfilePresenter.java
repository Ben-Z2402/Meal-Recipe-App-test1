package interface_adapter.UserProfile;

import use_case.UserProfile.UserProfileOutputBoundary;
import use_case.UserProfile.UserProfileOutputData;

public class UserProfilePresenter implements UserProfileOutputBoundary {
    private final UserProfileViewModel userProfileViewModel;
    private ViewManagerModel viewManagerModel;

    public UserProfilePresenter(UserProfileViewModel userProfileViewModel,
                                ViewManagerModel viewManagerModel) {
        this.userProfileViewModel = userProfileViewModel;
        this.viewManagerModel = viewManagerModel;

    }

    @Override
    public void prepareSuccessView(UserProfileOutputData user) {
        UserProfileState userProfileState = userProfileViewModel.getState();
    }

    @Override
    public void prepareFailView(String error) {

    }
}
