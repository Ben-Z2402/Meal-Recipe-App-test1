package use_case.weekly_diet;

import entity.UserProfile;
import java.util.ArrayList;

public class WeeklyDietInputData {

    final private UserProfile user;

    public WeeklyDietInputData(UserProfile user) {
        this.user = user;
    }

    float getWeeklyBudget() {
        return user.getWeeklyBudget();
    }

    int getAge() {
        return user.getAge();
    }

    ArrayList<String> getDietaryRestrictions() {
        return user.getDietaryRestrictions();
    }

    float getHeight() {
        return user.getHeight();
    }

    int getRecommendedDailyCalories() {
        return user.getRecommendedDailyCalories();
    }

    float getWeight() {
        return user.getWeight();
    }
}
