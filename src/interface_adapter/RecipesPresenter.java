package interface_adapter;

import use_case.weekly_diet.WeeklyDietOutputBoundary;
import use_case.weekly_diet.WeeklyDietInputData;
import use_case.weekly_diet.WeeklyDietOutputData;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RecipesPresenter implements WeeklyDietOutputBoundary {

    private final RecipesViewModel recipesViewModel;
    private ViewManagerModel viewManagerModel;

    public RecipesPresenter(ViewManagerModel viewManagerModel, RecipesViewModel recipesViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.recipesViewModel = recipesViewModel;
    }

    @Override
    public void prepareSuccessView(WeeklyDietOutputData response) {
        LocalDateTime responseTime = LocalDateTime.parse(response.getCreationTime());
        response.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
    }
}
