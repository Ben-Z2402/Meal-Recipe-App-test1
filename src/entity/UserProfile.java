package entity;

import java.util.ArrayList;

public class UserProfile {
    private String username;
    private String password;
    private float weight;
    private float height;
    private int age;
    private ArrayList<String> dietaryRestrictions;
    private float weeklyBudget;
    private int recommendedDailyCalories;

    public UserProfile(String username, String password, float weight, float height, int age,
                       ArrayList<String> dietaryRestrictions, float weeklyBudget, int recommendedDailyCalories) {
        this.username = username;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.dietaryRestrictions = dietaryRestrictions;
        this.weeklyBudget = weeklyBudget;
        this.recommendedDailyCalories = recommendedDailyCalories;
    }

    public String getUsername() { return this.username; }
    public String getPassword() { return this.password; }
    public float getWeight() {
        return this.weight;
    }
    public float getHeight() {
        return this.height;
    }
    public int getAge() {
        return this.age;
    }
    public ArrayList<String> getDietaryRestrictions() {
        return this.dietaryRestrictions;
    }
    public float getWeeklyBudget() {
        return this.weeklyBudget;
    }
    public int getRecommendedDailyCalories() {
        return recommendedDailyCalories;
    }



    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDietaryRestrictions(ArrayList<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }
    public void setWeeklyBudget(float weeklyBudget) {
        this.weeklyBudget = weeklyBudget;
    }
    public void setRecommendedDailyCalories(int recommendedDailyCalories) {
        this.recommendedDailyCalories = recommendedDailyCalories;
    }
}
