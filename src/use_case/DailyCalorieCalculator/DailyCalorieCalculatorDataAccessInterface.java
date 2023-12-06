package use_case.DailyCalorieCalculator;

import entity.UserProfile;

public interface DailyCalorieCalculatorDataAccessInterface {
    UserProfile getUserProfile(String user);
    void updateCalories(UserProfile user, double recCalories);
}
