package entity;

import java.util.ArrayList;

public interface meal {
    String getName();

    String getDescription();

    ArrayList<String> getIngredients();

    int getCalories();

    float getPrice();

}
