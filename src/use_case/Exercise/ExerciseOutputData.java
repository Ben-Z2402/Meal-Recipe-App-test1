package use_case.Exercise;

public class ExerciseOutputData {

    private final int caloriesBurned;

    private boolean useCaseFailed; // for invalid characters inputted into duration

    public ExerciseOutputData(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
