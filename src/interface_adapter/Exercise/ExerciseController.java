package interface_adapter.Exercise;

import use_case.Exercise.ExerciseInputBoundary;
import use_case.Exercise.ExerciseInputData;

public class ExerciseController {
    final ExerciseInputBoundary userExerciseUseCaseInteractor;

    public ExerciseController(ExerciseInputBoundary userExerciseUseCaseInteractor) {
        this.userExerciseUseCaseInteractor = userExerciseUseCaseInteractor;
    }

    public void execute(String exerciseType, int duration, float weight) {
        ExerciseInputData exerciseInputData = new ExerciseInputData(exerciseType, duration, weight);
        userExerciseUseCaseInteractor.execute(exerciseInputData);
    }
}
