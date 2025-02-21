package use_case.weekly_diet;

import api.EdamamAPICall;
import com.alibaba.fastjson.JSONException;
import entity.MealInfo;
import entity.UserProfile;
import entity.UserProfileFactory;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class WeeklyDietInteractor implements WeeklyDietInputBoundary {

    final WeeklyDietDataAccessInterface weeklyDietDataAccessObject;
    final WeeklyDietOutputBoundary weeklyDietPresenter;
    final UserProfileFactory userProfileFactory;

    public WeeklyDietInteractor(WeeklyDietDataAccessInterface weeklyDietDataAccessInterface,
                                WeeklyDietOutputBoundary weeklyDietOutputBoundary, UserProfileFactory userProfileFactory) {
        this.weeklyDietDataAccessObject = weeklyDietDataAccessInterface;
        this.weeklyDietPresenter = weeklyDietOutputBoundary;
        this.userProfileFactory = userProfileFactory;
    }

    @Override
    public void execute(WeeklyDietInputData weeklyDietInputData) {
        LocalDateTime now = LocalDateTime.now();

        String username = weeklyDietInputData.getUsername();
        UserProfile userProfile = weeklyDietDataAccessObject.getUserProfile(username);

        String gender = userProfile.getGender();
        int age = userProfile.getAge();
        float budget = userProfile.getWeeklyBudget();
        float height = userProfile.getHeight();
        float weight = userProfile.getWeight();
        ArrayList<String> dietaryRestrictions = userProfile.getDietaryRestrictions();
        float dailyCals = userProfile.getRecommendedDailyCalories();
        double breakfastCals = 0.25 * dailyCals;
        double lunchCals = 0.35 * dailyCals;
        double dinnerCals = 0.4 * dailyCals;

        ArrayList<MealInfo> weeklyDiet = new ArrayList<MealInfo>();
        Dictionary<Integer, String> mealType = new Hashtable<>();
        Dictionary<Integer, Double> mealTypeCals = new Hashtable<>();
        mealTypeCals.put(1, breakfastCals);
        mealTypeCals.put(2, lunchCals);
        mealTypeCals.put(3, dinnerCals);
        mealType.put(1, "Breakfast");
        mealType.put(2, "Lunch");
        mealType.put(3, "Dinner");
        int mealTypeInt = 1;
        do {
            Dictionary<String, Object> query = new Hashtable<>();
            for (int i = 0; i < dietaryRestrictions.size(); i++) {
                query.put("health", dietaryRestrictions.get(i));
            }
            query.put("mealType", mealType.get(mealTypeInt));
            String calories = mealTypeCals.get(mealTypeInt) - 0.1 * mealTypeCals.get(mealTypeInt) + "-" +
                    (mealTypeCals.get(mealTypeInt) + 0.1 * mealTypeCals.get(mealTypeInt));
            System.out.println(calories);
            query.put("calories", calories);

            Dictionary<String, ArrayList<String>> result = new Hashtable<>();
            try {
                result = EdamamAPICall.RecipeUrl(query);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String key = result.keys().nextElement();
            ArrayList<String> value = result.get(key);
            MealInfo recipe = new MealInfo(key, value.get(0), Integer.parseInt(value.get(1)),
                    Float.parseFloat(value.get(2)), Float.parseFloat(value.get(3)), Float.parseFloat(value.get(4)),
                    Float.parseFloat(value.get(5)), Float.parseFloat(value.get(6)), Float.parseFloat(value.get(7)),
                    Float.parseFloat(value.get(8)), value.get(9).split(","));

            if (!weeklyDietDataAccessObject.recipeSaved(recipe, userProfile)) {
                if (mealTypeInt < 3) {
                    mealTypeInt++;
                }
                else {
                    mealTypeInt = 1;
                }
                weeklyDiet.add(recipe);
                weeklyDietDataAccessObject.saveRecipe(recipe, userProfile);
            }

        } while (weeklyDiet.size() < 21);

        WeeklyDietOutputData weeklyDietOutputData = new WeeklyDietOutputData(weeklyDiet, now.toString(), false);
        weeklyDietPresenter.prepareSuccessView(weeklyDietOutputData);
    }
}
