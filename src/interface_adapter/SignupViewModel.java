package interface_adapter;

import java.beans.PropertyChangeListener;

public class SignupViewModel extends ViewModel {
    public SignupViewModel(String viewName) {
        super(viewName);
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
