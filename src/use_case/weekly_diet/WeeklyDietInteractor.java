package use_case.weekly_diet;

import entity.MealInfo;
import entity.MealInfoFactory;
import entity.UserProfile;
import entity.UserProfileFactory;
import java.time.LocalDateTime;

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

        UserProfile userProfile = userProfileFactory.create(weeklyDietInputData.getWeight(), weeklyDietInputData.getHeight(),
                weeklyDietInputData.getAge(), weeklyDietInputData.getDietaryRestrictions(), weeklyDietInputData.getWeeklyBudget(),
                weeklyDietInputData.getRecommendedDailyCalories());


        ...


        WeeklyDietOutputData weeklyDietOutputData = new WeeklyDietOutputData(weeklyDiet, now.toString(), false);
        weeklyDietPresenter.prepareSuccessView(weeklyDietOutputData);
    }
}
