package interface_adapter.Exercise;

public class ExerciseState {
    private String exerciseType = "";
    private float duration = 0;

    public ExerciseState(ExerciseState copy) {
        exerciseType = copy.exerciseType;
        duration = copy.duration;
    }

    public ExerciseState() {
    }

    public String getExerciseType() {
        return exerciseType;
    }
    public float getDuration() {
        return duration;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

}
