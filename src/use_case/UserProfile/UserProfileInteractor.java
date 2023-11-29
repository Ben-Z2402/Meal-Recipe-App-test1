package use_case.UserProfile;

import entity.UserProfile;

import java.util.ArrayList;

public class UserProfileInteractor implements UserProfileInputBoundary {
    final UserProfileDataAccessInterface userProfileDataAccessObject;
    final UserProfileOutputBoundary userProfilePresenter;
    public UserProfileInteractor(UserProfileDataAccessInterface userProfileDataAccessObject,
                                 UserProfileOutputBoundary userProfilePresenter) {
        this.userProfileDataAccessObject = userProfileDataAccessObject;
        this.userProfilePresenter = userProfilePresenter;
    }
    public void execute(UserProfileInputData userProfileInputData) {
        // Below is the information regarding the UserProfile to be created.
        String username = userProfileInputData.getUsername();
        String password = userProfileInputData.getPassword();
        float weight = userProfileInputData.getWeight();
        float height = userProfileInputData.getHeight();
        int age = userProfileInputData.getAge();
        ArrayList<String> dietaryRestrictions = userProfileInputData.getDietaryRestrictions();
        float weeklyBudget = userProfileInputData.getWeeklyBudget();
        int recommendedDailyCalories = userProfileInputData.getRecommendedDailyCalories();

        // Creating the new UserProfile;
        if (this.userProfileDataAccessObject.existsByName("username")) {
            this.userProfilePresenter.prepareFailView("Username already exists");
        }
        else if (this.userProfileDataAccessObject.)
        UserProfile userProfile = new UserProfile(weight, height, age, dietaryRestrictions, weeklyBudget,
                recommendedDailyCalories);

    }
}
