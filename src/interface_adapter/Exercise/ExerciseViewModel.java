package interface_adapter.Exercise;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ExerciseViewModel extends ViewModel {

    private ExerciseState state = new ExerciseState();

    public ExerciseViewModel(String viewName) {
        super(viewName);
    }


    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
