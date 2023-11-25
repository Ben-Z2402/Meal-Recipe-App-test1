package interface_adapter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DailyCalorieCalculatorModel {
    public final String TITLE_LABEL = "Daily Calorie Calculator";
    public final String WEIGHT_LABEL = "Weight (kg)";
    public final String HEIGHT_LABEL = "Height (cm)";
    public final String AGE_LABEL = "Age (years)";
    public final String GENDER_LABEL = "Gender (M/F)";
    public final String CALCULATE_LABEL = "Calculate Calories";
    public final String RESULT_LABEL = "Calories per day";
    public final String CANCEL_LABEL = "Cancel";

    private DailyCalorieCalculatorState state = new DailyCalorieCalculatorState();
}
