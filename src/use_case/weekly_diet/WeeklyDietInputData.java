package use_case.weekly_diet;

import entity.UserProfile;

public class WeeklyDietInputData {

    final private UserProfile user;

    public WeeklyDietInputData(UserProfile user) {
        this.user = user;
    }

    UserProfile getUser() {
        return user;
    }
}
