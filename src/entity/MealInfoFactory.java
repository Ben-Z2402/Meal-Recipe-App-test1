package entity;

import java.util.ArrayList;

public interface MealInfoFactory {
    Meal create(String name, String description, int calories, float price, float carbohydrates, float fat,
                float protein, float vitamins, float sodium, float cholestrol, ArrayList<String> ingredients);
}
