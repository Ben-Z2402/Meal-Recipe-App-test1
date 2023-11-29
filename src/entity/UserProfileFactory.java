package entity;

import java.util.ArrayList;

public interface UserProfileFactory {
    UserProfile create(String username, String password, float weight, float height, int age,
                       ArrayList<String> dietaryRestrictions, float weeklyBudget, int recommendedDailyCalories);
}
