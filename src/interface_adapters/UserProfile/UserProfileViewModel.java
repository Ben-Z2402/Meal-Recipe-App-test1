package interface_adapters.UserProfile;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class UserProfileViewModel extends ViewModel {
    public final String TITLE_LABEL = "Log In View";
    public final String USERNAME_LABEL = "Enter username";
    public final String PASSWORD_LABEL = "Enter password";

    public final String LOGIN_BUTTON_LABEL = "Log in";
    public final String CANCEL_BUTTON_LABEL = "Cancel";

    private UserProfileState state = new UserProfileState();

    public UserProfileViewModel() {
        super("log in");
    }

    @Override
    public void firePropertyChanged() {
        support.fire
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
