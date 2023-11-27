package use_case.UserProfile;

public class UserProfileOutputData {
    private final String username;

    private boolean useCaseFailed;

    public UserProfileOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsername() { return this.username; }
}
