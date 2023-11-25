package use_case.weekly_diet;

import entity.MealInfo;
import java.util.ArrayList;

public class WeeklyDietOutputData {
    private final ArrayList<MealInfo> weeklyDiet;
    private String creationTime;

    private boolean useCaseFailed;

    public WeeklyDietOutputData(ArrayList<MealInfo> weeklyDiet, String creationTime, boolean useCaseFailed) {
        this.weeklyDiet = weeklyDiet;
        this.creationTime = creationTime;
        this.useCaseFailed = useCaseFailed;
    }

    public ArrayList<MealInfo> getWeeklyDiet() {
        return weeklyDiet;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
