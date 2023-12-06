package interface_adapter.Signup;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SignupViewModel extends ViewModel {
    public static final String TITLE_LABEL = "Sign Up View";
    public static final String USERNAME_LABEL = "Create a username:";
    public static final String PASSWORD_LABEL = "Create a password:";
    public static final String REPEAT_PASSWORD_LABEL = "Re-enter password:";
    public static final String GENDER_LABEL = "Enter your gender (male or female)";
    public static final String WEIGHT_LABEL = "Enter weight (kg)";
    public static final String HEIGHT_LABEL = "Enter height (cm)";
    public static final String AGE_LABEL = "Enter your age";
    public static final String DIETARY_RESTRICTIONS_LABEL = "Select your dietary restrictions";
    public static final String WEEKLY_BUDGET_LABEL = "Enter your weekly budget";
    public static final String SIGNUP_BUTTON_LABEL = "Sign up";

    private SignupState state = new SignupState();

    public SignupViewModel() {
        super("sign up");
    }

    public void setState(SignupState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public SignupState getState() {
        return this.state;
    }
}
