package interface_adapter;

import use_case.DailyCalorieCalculator.DailyCalorieCalculatorBoundary;
import use_case.DailyCalorieCalculator.DailyCalorieCalculatorInputData;

public class DailyCalorieCalculatorController {
    final DailyCalorieCalculatorBoundary userDailyCalorieCalculatorInteractor;

    public DailyCalorieCalculatorController(DailyCalorieCalculatorBoundary userDailyCalorieCalculatorInteractor) {
        this.userDailyCalorieCalculatorInteractor = userDailyCalorieCalculatorInteractor;
    }

    public void execute(String gender, int age, float height, float weight_lbs) {
        DailyCalorieCalculatorInputData dailyCalorieCalculatorInputData = new DailyCalorieCalculatorInputData(gender, age, height, weight_lbs);
        userDailyCalorieCalculatorInteractor.execute(dailyCalorieCalculatorInputData);
    }
}
