package use_case.Exercise;

public class ExerciseInputData {
    /* using Calculator.net
    based on the equation Calories = MET (Metabolic Equivalent  of Task) x Body Weight (kg) x Time (min) x (3.5/200)
    (not accounting for factors such as age, height, etc)
    1 MET is 1 kcal/kg/hr
    Type of exercise (Walking, Running, Cycling, Swimming) and intensity (slow, moderate, fast)
    Time (in hour/minutes)
    Weight (lb) convert to kg

    e.g. walking slow for 1 minute with 75 kg body weight = 2 x 75 x 1 x (3.5/200) = 2.6 calories

    MET ratios from Calculator.net (rough estimates):
    Walking: slow - 2
    Walking: moderate - 2.6
    Walking: fast - 3.6
    Walking: very fast - 4.6 // very fast should be disregarded probably
    Running: slow - 7.6
    Running: moderate - 9.9
    Running: fast - 12.2
    Running: very fast - 15.2
    Cycling: slow - 7.6
    Cycling: moderate - 9.9
    Cycling: fast - 11.4
    Cycling: very fast - 16
    Swimming: moderate - 5.8
    Swimming: laps, vigorous - 9.9
    */

    final private String exerciseType;

    final private float duration;
    final private float weight;

    public ExerciseInputData(String exerciseType, int duration, float weight) {
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
