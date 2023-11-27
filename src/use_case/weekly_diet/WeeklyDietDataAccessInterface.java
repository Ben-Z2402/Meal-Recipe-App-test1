package use_case.weekly_diet;

import entity.UserProfile;

import java.util.ArrayList;

public interface WeeklyDietDataAccessInterface {

    float getWeeklyBudget(UserProfile userProfile);

    int getAge(UserProfile userProfile);

    ArrayList<String> getDietaryRestrictions(UserProfile userProfile);

    float getHeight(UserProfile userProfile);

    int getRecommendedDailyCalories(UserProfile userProfile);

    float getWeight(UserProfile userProfile);
}
