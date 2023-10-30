package entity;

import java.util.ArrayList;

public interface Meal {
    String getName();

    String getDescription();

    ArrayList<String> getIngredients();

    int getCalories();

    float getPrice();

}
