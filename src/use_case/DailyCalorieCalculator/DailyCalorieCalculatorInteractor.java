package use_case.DailyCalorieCalculator;

import entity.UserProfile;
import entity.UserProfileFactory;

public class DailyCalorieCalculatorInteractor implements DailyCalorieCalculatorBoundary {
    final DailyCalorieCalculatorOutputBoundary dailyCalorieCalculatorPresenter;

    final DailyCalorieCalculatorDataAccessInterface dailyCalorieCalculatorDataAccessInterface;

    public DailyCalorieCalculatorInteractor(DailyCalorieCalculatorOutputBoundary dailyCalorieCalculatorPresenter, DailyCalorieCalculatorDataAccessInterface dailyCalorieCalculatorDataAccessInterface) {
            this.dailyCalorieCalculatorPresenter = dailyCalorieCalculatorPresenter;
            this.dailyCalorieCalculatorDataAccessInterface = dailyCalorieCalculatorDataAccessInterface;
        }
    @Override
    public void execute(DailyCalorieCalculatorInputData dailyCalorieCalculatorInputData) {
        String username = dailyCalorieCalculatorInputData.getUsername();
        UserProfile userProfile = dailyCalorieCalculatorDataAccessInterface.getUserProfile(username);
        float weight = userProfile.getWeight();
        float height = userProfile.getHeight();
        int age = userProfile.getAge();
        String gender = userProfile.getGender();
        double recCalories;

        // weight in kg, height in cm, age in years

        if (gender.equals("male")) {
            recCalories = (66 + (13.7 * weight) + (5 * height) - (6.8 * age));
        }
        else {
            recCalories = (655 + (9.6 * weight) + (1.8 * height) - (4.7 * age));
        }
        DailyCalorieCalculatorOutputData dailyCalorieCalculatorOutputData = new DailyCalorieCalculatorOutputData(recCalories);
        dailyCalorieCalculatorDataAccessInterface.updateCalories(userProfile, recCalories);
        dailyCalorieCalculatorPresenter.prepareSuccessView(dailyCalorieCalculatorOutputData);
    }
}
