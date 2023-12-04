package use_case.DailyCalorieCalculator;

public class DailyCalorieCalculatorInteractor implements DailyCalorieCalculatorBoundary {

    final DailyCalorieCalculatorOutputBoundary dailyCalorieCalculatorPresenter;

    public DailyCalorieCalculatorInteractor(DailyCalorieCalculatorOutputBoundary dailyCalorieCalculatorPresenter) {
            this.dailyCalorieCalculatorPresenter = dailyCalorieCalculatorPresenter;
        }
    @Override
    public void execute(DailyCalorieCalculatorInputData dailyCalorieCalculatorInputData) {
        float weight = dailyCalorieCalculatorInputData.getWeight_lbs();
        float height = dailyCalorieCalculatorInputData.getHeight();
        int age = dailyCalorieCalculatorInputData.getAge();
        String gender = dailyCalorieCalculatorInputData.getGender();
        double recCalories;

        if (gender.equals("male")) {
            recCalories = (66 + (13.7 * weight) + (5 * height) - (6.8 * age));
        }
        else {
            recCalories = (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
        }
        DailyCalorieCalculatorOutputData dailyCalorieCalculatorOutputData = new DailyCalorieCalculatorOutputData(recCalories);
        dailyCalorieCalculatorPresenter.prepareSuccessView(dailyCalorieCalculatorOutputData);
    }
}
