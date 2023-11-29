package use_case.Login;

import entity.UserProfile;

public interface LoginUserDataAccessInterface {
    boolean existsByName(String identifier);
    void save(UserProfile user);
    UserProfile getUserProfile(String username);
}
