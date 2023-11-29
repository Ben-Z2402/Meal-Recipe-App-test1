package interface_adapter.SignedIn;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;

public class SignedInViewModel extends ViewModel {
    public SignedInViewModel(String viewName) {
        super(viewName);
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
