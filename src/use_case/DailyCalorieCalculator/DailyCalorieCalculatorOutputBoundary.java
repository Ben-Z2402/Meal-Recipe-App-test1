package use_case.DailyCalorieCalculator;

public interface DailyCalorieCalculatorOutputBoundary {
    void prepareSuccessView(DailyCalorieCalculatorOutputData dailyCalorieCalculatorOutputData);
    void prepareFailView(String error);
}
