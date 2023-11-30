package entity;

import java.util.ArrayList;

public class CommonUserProfileFactory implements UserProfileFactory {

    @Override
    public UserProfile create(String username, String password, float weight, float height, int age,
                              ArrayList<String> dietaryRestrictions, float weeklyBudget, int recommendedDailyCalories) {
        return new UserProfile(username, password, weight, height, age, dietaryRestrictions, weeklyBudget,
                recommendedDailyCalories);
    }
}
