package use_case.UserProfile;

import entity.UserProfile;

public interface UserProfileDataAccessInterface {
    boolean existsByName(String identifier);
    void save(UserProfile userProfile);
}
