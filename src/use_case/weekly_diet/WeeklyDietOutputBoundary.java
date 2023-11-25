package use_case.weekly_diet;

public interface WeeklyDietOutputBoundary {
    void prepareSuccessView(WeeklyDietOutputData diet);

    void prepareFailView(String error);
}
