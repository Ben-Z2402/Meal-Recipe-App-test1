package interface_adapter;

import use_case.weekly_diet.WeeklyDietOutputBoundary;
import use_case.weekly_diet.WeeklyDietInputData;
import use_case.weekly_diet.WeeklyDietOutputData;

public class RecipesPresenter implements WeeklyDietOutputBoundary {

    @Override
    public void prepareSuccessView(WeeklyDietOutputData diet) {

    }
}
