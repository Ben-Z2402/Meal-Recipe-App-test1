package view;

import entity.UserProfile;
import entity.UserProfileFactory;
import interface_adapter.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class RecipesView extends JPanel implements ActionListener, PropertyChangeListener {
    public final String viewName = "recipes";

    private final RecipesViewModel recipesViewModel;
    private final JLabel recipeName;
    private final JLabel description;
    private final JLabel nutrients;
    private final JLabel ingredients;
    private final JLabel instructions;
    private final WeeklyDietController weeklyDietController;

    private final JButton next;
    private final JButton ok;

    public RecipesView(WeeklyDietController controller, RecipesViewModel recipesViewModel) {

        this.weeklyDietController = controller;
        this.recipesViewModel = recipesViewModel;
        recipesViewModel.addPropertyChangeListener(this);

        JLabel title = new JLabel(recipesViewModel.TITLE_LABEL);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel recipeInfo = new JPanel();

        JPanel buttons = new JPanel();
        next = new JButton(recipesViewModel.NEXT_BUTTON_LABEL);
        buttons.add(next);
        ok = new JButton(recipesViewModel.OK_BUTTON_LABEL);
        buttons.add(ok);
    }

    next.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource().equals(next)) {
                    RecipesState currentState = recipesViewModel.getState();
                    ...

                    weeklyDietController.execute(...);
                }
            }
        }
    );

    ok.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (evt.getSource().equals(ok)) {
                    RecipesState currentState = recipesViewModel.getState();
                    ...

                    weeklyDietController.execute(...);
                }
            }
        }
    );

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
