//package use_case.weekly_diet;
//
//import entity.UserProfile;
//import entity.UserProfileFactory;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//
//public class WeeklyDietInteractor implements WeeklyDietInputBoundary {
//
//    final WeeklyDietDataAccessInterface weeklyDietDataAccessObject;
//    final WeeklyDietOutputBoundary weeklyDietPresenter;
//    final UserProfileFactory userProfileFactory;
//
//    public WeeklyDietInteractor(WeeklyDietDataAccessInterface weeklyDietDataAccessInterface,
//                                WeeklyDietOutputBoundary weeklyDietOutputBoundary, UserProfileFactory userProfileFactory) {
//        this.weeklyDietDataAccessObject = weeklyDietDataAccessInterface;
//        this.weeklyDietPresenter = weeklyDietOutputBoundary;
//        this.userProfileFactory = userProfileFactory;
//    }
//
//    @Override
//    public void execute(WeeklyDietInputData weeklyDietInputData) {
//        LocalDateTime now = LocalDateTime.now();
//
//        String username = weeklyDietInputData.getUsername();
//        UserProfile userProfile = weeklyDietDataAccessObject.getUserProfile(username);
//
//        int age = userProfile.getAge();
//        float budget = userProfile.getWeeklyBudget();
//        float height = userProfile.getHeight();
//        float weight = userProfile.getWeight();
//        ArrayList<String> dietaryRestrictions = userProfile.getDietaryRestrictions();
//        int dailyCals = userProfile.getRecommendedDailyCalories();
//
//        ArrayList<MealInfo> weeklyDiet = new ArrayList<MealInfo>();
//        do {
//            weeklyDiet = ...;
//        } while (weeklyDietDataAccessObject.recipeSaved(weeklyDiet, userProfile));
//
//        weeklyDietDataAccessObject.saveRecipe(weeklyDiet, userProfile);
//
//        WeeklyDietOutputData weeklyDietOutputData = new WeeklyDietOutputData(weeklyDiet, now.toString(), false);
//        weeklyDietPresenter.prepareSuccessView(weeklyDietOutputData);
//    }
//}
