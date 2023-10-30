package entity;

import java.util.ArrayList;

public class MealInfo implements Meal {
    private String name;
    private String description;
    private int calories;
    private float price;
    private float carbohydrates;
    private float fat;
    private float protein;
    private float vitamins;
    private float sodium;
    private float cholestrol;
    private ArrayList<String> ingredients;

    MealInfo(String name, String description, int calories, float price, float carbohydrates, float fat, float protein, float vitamins, float sodium, float cholestrol, ArrayList<String> ingredients) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
        this.vitamins = vitamins;
        this.sodium = sodium;
        this.cholestrol = cholestrol;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public int getCalories() {
        return calories;
    }
}
