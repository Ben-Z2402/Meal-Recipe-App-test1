package interface_adapter;

import use_case.DailyCalorieCalculator.DailyCalorieCalculatorBoundary;
import use_case.DailyCalorieCalculator.DailyCalorieCalculatorInputData;

public class DailyCalorieCalculatorController {
    final DailyCalorieCalculatorBoundary userDailyCalorieCalculatorInteractor;

    public DailyCalorieCalculatorController(DailyCalorieCalculatorBoundary userDailyCalorieCalculatorInteractor) {
        this.userDailyCalorieCalculatorInteractor = userDailyCalorieCalculatorInteractor;
    }

    public void execute(String username) {
        DailyCalorieCalculatorInputData dailyCalorieCalculatorInputData = new DailyCalorieCalculatorInputData(username);
        userDailyCalorieCalculatorInteractor.execute(dailyCalorieCalculatorInputData);
    }
}