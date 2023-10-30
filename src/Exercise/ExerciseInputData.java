package Exercise;

public class ExerciseInputData {
    /* using Calculator.net
    Type of Exercise (Walking, Running, Cycling, Swimming)
    Time (in hour/minutes)
    Intensity (slow, moderate, fast, very fast)
    Weight (lb)
    */

    final private String exerciseType;

    private final int duration;
    final private String intensity;
    final private int weight;

    public ExerciseInputData(String exerciseType, int duration, String intensity, int weight) {
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.intensity = intensity;
        this.weight = weight;
    }

    String getExerciseType() {
        return exerciseType;
    }

    int getDuration() {
        return duration;
    }

    String getIntensity() {
        return intensity;
    }

    int getWeight() {
        return weight;
    }
}
