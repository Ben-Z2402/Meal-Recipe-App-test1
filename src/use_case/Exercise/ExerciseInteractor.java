package use_case.Exercise;

public class ExerciseInteractor implements ExerciseInputBoundary{

    final ExerciseDataAccessInterface dataAccessObject;

    final ExerciseOutputBoundary exercisePresenter;

    public ExerciseInteractor(ExerciseDataAccessInterface dataAccessObject, ExerciseOutputBoundary exercisePresenter) {
        this.dataAccessObject = dataAccessObject;
        this.exercisePresenter = exercisePresenter;
    }

    @Override
    public void execute(ExerciseInputData exerciseInputData) {

    }
}
