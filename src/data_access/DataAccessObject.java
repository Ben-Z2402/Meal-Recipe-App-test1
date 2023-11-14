package data_access;

import entity.UserProfile;
import use_case.Exercise.ExerciseDataAccessInterface;

public class DataAccessObject implements ExerciseDataAccessInterface {
    @Override
    public float get(UserProfile user) {
        return user.getWeight();
    }
}
