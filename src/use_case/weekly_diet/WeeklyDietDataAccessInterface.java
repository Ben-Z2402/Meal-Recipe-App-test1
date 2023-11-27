package use_case.weekly_diet;

import entity.MealInfo;
import entity.UserProfile;
import java.util.ArrayList;

public interface WeeklyDietDataAccessInterface {

    UserProfile getUserProfile(String username);

    void saveRecipe(ArrayList<MealInfo> recipe, UserProfile userProfile);

    boolean recipeSaved(ArrayList<MealInfo> recipe, UserProfile userProfile);
}
