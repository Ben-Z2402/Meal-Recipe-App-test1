package entity;

import java.util.ArrayList;

public class MealInfo {
    private String name;
    private String description;
    private int calories;
    private float price;
    private float carbohydrates;
    private float fat;
    private float protein;
    private float vitamins;
    private float sodium;
    private float cholesterol;
    private ArrayList<String> ingredients;

    MealInfo(String name, String description, int calories, float price, float carbohydrates, float fat, float protein,
             float vitamins, float sodium, float cholestrol, ArrayList<String> ingredients) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.price = price;
        this.carbohydrates = carbohydrates;
        this.fat = fat;
        this.protein = protein;
        this.vitamins = vitamins;
        this.sodium = sodium;
        this.cholesterol = cholestrol;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public float getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}
