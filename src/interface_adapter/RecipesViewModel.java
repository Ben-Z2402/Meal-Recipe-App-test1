package interface_adapter;

import java.beans.PropertyChangeListener;

public class RecipesViewModel extends ViewModel {
    public RecipesViewModel(String viewName) {
        super(viewName);
    }

    @Override
    public void firePropertyChanged() {

    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }
}
