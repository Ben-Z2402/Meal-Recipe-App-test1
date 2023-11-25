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
        float weight = userProfileInputData.getWeight();
        float height = userProfileInputData.getHeight();
        int age = userProfileInputData.getAge();
        ArrayList<String> dietaryRestrictions = userProfileInputData.getDietaryRestrictions();
        float weeklyBudget = userProfileInputData.getWeeklyBudget();
        int recommendedDailyCalories = userProfileInputData.getRecommendedDailyCalories();

        UserProfile userProfile = new UserProfile(weight, height, age, dietaryRestrictions, weeklyBudget,
                recommendedDailyCalories);

    }
}
