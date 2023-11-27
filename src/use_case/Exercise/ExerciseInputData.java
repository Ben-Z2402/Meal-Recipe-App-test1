package use_case.Exercise;

public class ExerciseInputData {
    /* using Calculator.net
    based on the equation Calories = MET (Metabolic Equivalent  of Task) x Body Weight (kg) x Time (min) x (3.5/200)
    (not accounting for factors such as age, height, etc)
    Type of exercise (Walking, Running, Cycling, Swimming) and intensity (slow, moderate, fast)
    Time (in hour/minutes)
    Weight (lb)

    e.g. walking slow for 1 minute with 75 kg body weight = 2 x 75 x 1 x (3.5/200) = 2.6 calories

    MET ratios:
    Walking: slow - 2
    Walking: moderate - 2.6
    */

    final private String exerciseType;

    final private float duration;
    final private float weight;

    public ExerciseInputData(String exerciseType, int duration, int weight) {
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.weight = weight;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public float getDuration() {
        return duration;
    }

    public float getWeight() {
        return weight;
    }
}
