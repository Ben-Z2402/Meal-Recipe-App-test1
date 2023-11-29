package interface_adapter.Exercise;

import use_case.Exercise.ExerciseOutputBoundary;
import use_case.Exercise.ExerciseOutputData;

public class ExercisePresenter implements ExerciseOutputBoundary {

    private final ExerciseViewModel exerciseViewModel;

    public ExercisePresenter(ExerciseViewModel exerciseViewModel) {
        this.exerciseViewModel = exerciseViewModel;
    }

    @Override
    public void prepareSuccessView(ExerciseOutputData user) {

    }

    @Override
    public void prepareFailView(String error) {

    }
}
