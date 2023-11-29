package interface_adapter.UserProfile;

import use_case.UserProfile.UserProfileInputBoundary;
import use_case.UserProfile.UserProfileInputData;

import java.util.ArrayList;

public class UserProfileController {
    final UserProfileInputBoundary userProfileUseCaseInteractor;
    public UserProfileController(UserProfileInputBoundary userProfileUseCaseInteractor) {
        this.userProfileUseCaseInteractor = userProfileUseCaseInteractor;
    }

    public void execute(String username, String password, float weight, float height, int age,
                        ArrayList<String> dietaryRestrictions, float weeklyBudget, int recommendedDailyCalories) {

        UserProfileInputData userProfileInputData = new UserProfileInputData(username, password, weight, height, age,
                dietaryRestrictions, weeklyBudget, recommendedDailyCalories);
        this.userProfileUseCaseInteractor.execute(userProfileInputData);
    }
}
