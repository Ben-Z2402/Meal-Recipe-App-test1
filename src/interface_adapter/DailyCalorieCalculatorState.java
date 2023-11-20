package interface_adapter;

public class DailyCalorieCalculatorState {
    private String weight = "";
    private String weighError = null;
    private String height = "";
    private String heightError = "";
    private String age = "";
    private String ageError = "";
    private String gender = "";
    private String genderError = "";

    public DailyCalorieCalculatorState(DailyCalorieCalculatorState copy) {
        weight = copy.weight;
        weighError = copy.weighError;
        height = copy.height;
        heightError = copy.heightError;
        age = copy.age;
        ageError = copy.ageError;
    }

    public DailyCalorieCalculatorState() {}

    public String getWeight() {
        return weight;
    }

    public String getWeighError() {
        return weighError;
    }

    public String getHeight() {
        return height;
    }

    public String getHeightError() {
        return heightError;
    }

    public String getAge() {
        return age;
    }

    public String getAgeError() {
        return ageError;
    }

    public String getGender() {
        return gender;
    }
    public String getGenderError() {
        return genderError;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void setWeighError(String weighError) {
        this.weighError = weighError;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setHeightError(String heightError) {
        this.heightError = heightError;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void setAgeError(String ageError) {
        this.ageError = ageError;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setGenderError(String genderError) {
        this.genderError = genderError;
    }
}