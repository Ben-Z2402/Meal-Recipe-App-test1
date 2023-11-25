package interface_adapter;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class RecipesViewModel extends ViewModel {

    public final String TITLE_LABEL = "Recipes View";
    public final String NEXT_BUTTON_LABEL = "Next";
    public final String OK_BUTTON_LABEL = "Ok";

    private RecipesState state = new RecipesState();

    public RecipesViewModel() {
        super("recipes");
    }

    public void setState(RecipesState state) {
        this.state = state;
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public RecipesState getState() {
        return state;
    }
}
