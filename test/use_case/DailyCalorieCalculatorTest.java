package use_case;

import org.junit.Test;

import use_case.DailyCalorieCalculator.DailyCalorieCalculatorInteractor;
import use_case.DailyCalorieCalculator.DailyCalorieCalculatorOutputBoundary;
import use_case.DailyCalorieCalculator.DailyCalorieCalculatorInputData;
import use_case.DailyCalorieCalculator.DailyCalorieCalculatorOutputData;
public class DailyCalorieCalculatorTest {

        @Test
        public void testCalculateCalories() {
            DailyCalorieCalculatorOutputBoundary dailyCalorieCalculatorPresenter = new DailyCalorieCalculatorOutputBoundary() {
                @Override
                public void prepareSuccessView(DailyCalorieCalculatorOutputData dailyCalorieCalculatorOutputData) {
                    System.out.println(dailyCalorieCalculatorOutputData.getRecCalories());
                }

                @Override
                public void prepareFailView(String error) {

                }
            };
            DailyCalorieCalculatorInputData InData = new DailyCalorieCalculatorInputData("male", 20, 70, 150);
            DailyCalorieCalculatorInteractor Interactor = new DailyCalorieCalculatorInteractor(dailyCalorieCalculatorPresenter);
            Interactor.execute(InData);

        }
}