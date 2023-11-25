package interface_adapter;

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
