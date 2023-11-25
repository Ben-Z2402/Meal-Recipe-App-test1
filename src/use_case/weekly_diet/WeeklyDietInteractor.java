package use_case.weekly_diet;

import entity.MealInfo;
import entity.MealInfoFactory;
import entity.UserProfile;
import entity.UserProfileFactory;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class WeeklyDietInteractor implements WeeklyDietInputBoundary {

    final WeeklyDietDataAccessInterface weeklyDietDataAccessObject;
    final WeeklyDietOutputBoundary weeklyDietPresenter;
    final UserProfileFactory userProfileFactory;

    public WeeklyDietInteractor(WeeklyDietDataAccessInterface weeklyDietDataAccessInterface,
                                WeeklyDietOutputBoundary weeklyDietOutputBoundary, UserProfileFactory userProfileFactory) {
        this.weeklyDietDataAccessObject = weeklyDietDataAccessInterface;
        this.weeklyDietPresenter = weeklyDietOutputBoundary;
        this.userProfileFactory = userProfileFactory;
    }

    @Override
    public void execute(WeeklyDietInputData weeklyDietInputData) {
        LocalDateTime now = LocalDateTime.now();

        UserProfile userProfile = weeklyDietInputData.getUser();
        int age = weeklyDietDataAccessObject.getAge(userProfile);
        float budget = weeklyDietDataAccessObject.getWeeklyBudget(userProfile);
        float height = weeklyDietDataAccessObject.getHeight(userProfile);
        float weight = weeklyDietDataAccessObject.getWeight(userProfile);
        ArrayList<String> dietaryRestrictions = weeklyDietDataAccessObject.getDietaryRestrictions(userProfile);
        int dailyCals = weeklyDietDataAccessObject.getRecommendedDailyCalories(userProfile);

        weeklyDiet = ...;

        WeeklyDietOutputData weeklyDietOutputData = new WeeklyDietOutputData(weeklyDiet, now.toString(), false);
        weeklyDietPresenter.prepareSuccessView(weeklyDietOutputData);
    }
}
