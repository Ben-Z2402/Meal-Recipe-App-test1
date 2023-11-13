package use_case.DailyCalorieCalculator;

public class DailyCalorieCalculatorInputData {
    final private String gender;
    final private int age;
    final private float height;
    final private float weight_lbs;

    public DailyCalorieCalulatorData(String gender, int age, float height, float weight_lbs) {
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
