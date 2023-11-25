package interface_adapter;

import entity.UserProfile;
import use_case.weekly_diet.WeeklyDietInputBoundary;
import use_case.weekly_diet.WeeklyDietInputData;

public class WeeklyDietController {

    final WeeklyDietInputBoundary weeklyDietUseCaseInteractor;
    public WeeklyDietController(WeeklyDietInputBoundary weeklyDietUseCaseInteractor) {
        this.weeklyDietUseCaseInteractor = weeklyDietUseCaseInteractor;
    }

    public void execute(UserProfile user) {
        WeeklyDietInputData weeklyDietInputData = new WeeklyDietInputData(user);

        weeklyDietUseCaseInteractor.execute(weeklyDietInputData);
    }
}
