package use_case.DailyCalorieCalculator;

public class DailyCalorieCalculatorOutputData {
    private final double recCalories;

    public DailyCalorieCalculatorOutputData(double recCalories) {
        this.recCalories = recCalories;
    }

    public double getRecCalories() {
        return recCalories;
    }
}
