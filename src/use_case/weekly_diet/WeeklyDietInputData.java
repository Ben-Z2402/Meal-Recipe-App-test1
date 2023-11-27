package use_case.weekly_diet;

public class WeeklyDietInputData {

    final private String username;

    public WeeklyDietInputData(String username) {
        this.username = username;
    }

    String getUsername() {
        return username;
    }
}
