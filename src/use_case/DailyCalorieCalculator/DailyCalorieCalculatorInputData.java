package use_case.DailyCalorieCalculator;

public class DailyCalorieCalculatorInputData {
    private String gender;
    private int age;
    private float height;
    private float weight_lbs;

    public void DailyCalorieCalculatorData(String gender, int age, float height, float weight_lbs) {
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight_lbs = weight_lbs;
    }

    public DailyCalorieCalculatorInputData() {
    }

    String getGender() {return gender;}
    int getAge() {return age;}
    float getHeight() {return height;}
    float getWeight_lbs() {return weight_lbs;}
}
