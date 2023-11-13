package use_case.DailyCalorieCalculator;

public class DailyCalorieCalculatorOutputData {
    private final int recCalories;

    public DailyCalorieCalculatorOutputData(int recCalories) {
        this.recCalories = recCalories;
    }

    public int getRecCalories() {
        return recCalories;
    }
}
