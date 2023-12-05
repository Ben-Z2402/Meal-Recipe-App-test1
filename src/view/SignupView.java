package view;

import interface_adapter.Signup.SignupController;
import interface_adapter.Signup.SignupState;
import interface_adapter.Signup.SignupViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class SignupView extends JPanel implements ActionListener, PropertyChangeListener {
    public final String viewName = "sign up";

    private final SignupViewModel signupViewModel;
    private final JTextField usernameInputField = new JTextField(15);
    private final JPasswordField passwordInputField = new JPasswordField(15);
    private final JPasswordField repeatPasswordInputField = new JPasswordField(15);
    private final JTextField genderInputField = new JTextField(15);
    private final JTextField weightInputField = new JTextField(15);
    private final JTextField heightInputField = new JTextField(15);
    private final JTextField ageInputField = new JTextField(15);
    private final JButton dietaryRestrictionButton;
    private final JTextField weeklyBudgetInputField = new JTextField(15);

    private final SignupController signupController;

    private final JButton signUp;
    private final JButton cancel;

    public SignupView(SignupController controller, SignupViewModel signupViewModel) {

        this.signupController = controller;
        this.signupViewModel = signupViewModel;
        signupViewModel.addPropertyChangeListener(this);

        JLabel title = new JLabel(signupViewModel.TITLE_LABEL);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        LabelTextPanel usernameInfo = new LabelTextPanel(
                new JLabel(signupViewModel.USERNAME_LABEL), usernameInputField);
        LabelTextPanel passwordInfo = new LabelTextPanel(
                new JLabel(signupViewModel.PASSWORD_LABEL), passwordInputField);
        LabelTextPanel repeatPasswordInfo = new LabelTextPanel(
                new JLabel(signupViewModel.REPEAT_PASSWORD_LABEL), repeatPasswordInputField);
        LabelTextPanel genderInfo = new LabelTextPanel(
                new JLabel(signupViewModel.GENDER_LABEL), genderInputField);

        LabelTextPanel weightInfo = new LabelTextPanel(
                new JLabel(signupViewModel.WEIGHT_LABEL), weightInputField);
        LabelTextPanel heightInfo = new LabelTextPanel(
                new JLabel(signupViewModel.HEIGHT_LABEL), heightInputField);
        LabelTextPanel ageInfo = new LabelTextPanel(
                new JLabel(signupViewModel.AGE_LABEL), ageInputField);
        LabelTextPanel weeklyBudgetInfo = new LabelTextPanel(
                new JLabel(signupViewModel.WEEKLY_BUDGET_LABEL), weeklyBudgetInputField);
        JPanel buttons = new JPanel();
        signUp = new JButton(signupViewModel.SIGNUP_BUTTON_LABEL);
        buttons.add(signUp);
        cancel = new JButton(signupViewModel.CANCEL_BUTTON_LABEL);
        buttons.add(cancel);

        dietaryRestrictionButton = new JButton(signupViewModel.DIETARY_RESTRICTIONS_LABEL);

        JPopupMenu popUpMenu = new JPopupMenu();

        JCheckBox lactoseIntolerant = new JCheckBox("Lactose Intolerant");
        JCheckBox highBP = new JCheckBox("High Blood Pressure");

        popUpMenu.add(lactoseIntolerant);
        popUpMenu.add(highBP);

        dietaryRestrictionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popUpMenu.show(dietaryRestrictionButton, 0, dietaryRestrictionButton.getHeight());
            }
        });

        lactoseIntolerant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lactoseIntolerant.isSelected()) {
                    SignupState currentState = signupViewModel.getState();
                    currentState.addRestriction(lactoseIntolerant.getText());
                }
                else {
                    SignupState currentState = signupViewModel.getState();
                    currentState.removeRestriction(lactoseIntolerant.getText());
                }
            }
        });

        highBP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (highBP.isSelected()) {
                    SignupState currentState = signupViewModel.getState();
                    currentState.addRestriction(highBP.getText());
                }
                else {
                    SignupState currentState = signupViewModel.getState();
                    currentState.removeRestriction(highBP.getText());
                }
            }
        });


        buttons.add(dietaryRestrictionButton);

//        String selectedRestriction = (String) dropDownMenu.getSelectedItem();
//        SignupState currentState = signupViewModel.getState();
//        currentState.addRestriction(selectedRestriction);
        signUp.addActionListener(
                // This creates an anonymous subclass of ActionListener and instantiates it.
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if (evt.getSource().equals(signUp)) {
                            SignupState currentState = signupViewModel.getState();
                            signupController.execute(currentState.getUsername(),
                                    currentState.getPassword(),
                                    currentState.getRepeatPassword(),
                                    currentState.getGender(),
                                    currentState.getWeight(),
                                    currentState.getHeight(),
                                    currentState.getAge(),
                                    currentState.getDietaryRestrictions(),
                                    currentState.getWeeklyBudget(),
                                    currentState.getRecommendedDailyCalories());
                        }
                    }
                }
        );
        cancel.addActionListener(this);

        // This makes a new KeyListener implementing class, instantiates it, and
        // makes it listen to keystrokes in the usernameInputField.
        //
        // Notice how it has access to instance variables in the enclosing class!
        usernameInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setUsername(usernameInputField.getText() + e.getKeyChar());
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

        passwordInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setPassword(String.valueOf(passwordInputField.getPassword()) + e.getKeyChar());
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });

        repeatPasswordInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setRepeatPassword(String.valueOf(repeatPasswordInputField.getPassword()) + e.getKeyChar());
                        signupViewModel.setState(currentState);
                    }
                    @Override
                    public void keyPressed(KeyEvent e) {
                    }
                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                });
        genderInputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                SignupState currentState = signupViewModel.getState();
                currentState.setGender(genderInputField.getText() + e.getKeyChar());
                signupViewModel.setState(currentState);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        weightInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setWeight(Float.valueOf(weightInputField.getText() + e.getKeyChar()));
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                }
        );
        heightInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setHeight(Float.valueOf(heightInputField.getText() + e.getKeyChar()));
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                }
        );
        ageInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setAge(Integer.valueOf(ageInputField.getText() + e.getKeyChar()));
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                }
        );
        weeklyBudgetInputField.addKeyListener(
                new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        SignupState currentState = signupViewModel.getState();
                        currentState.setWeeklyBudget(Float.valueOf(weeklyBudgetInputField.getText() + e.getKeyChar()));
                        signupViewModel.setState(currentState);
                    }

                    @Override
                    public void keyPressed(KeyEvent e) {

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                }
        );

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(title);
        this.add(usernameInfo);
        this.add(passwordInfo);
        this.add(repeatPasswordInfo);
        this.add(genderInfo);
        this.add(weightInfo);
        this.add(heightInfo);
        this.add(ageInfo);
        this.add(weeklyBudgetInfo);
        this.add(buttons);

    }

    /**
     * React to a button click that results in evt.
     */
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Cancel not implemented yet.");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        SignupState state = (SignupState) evt.getNewValue();
        if (state.getUsernameError() != null) {
            JOptionPane.showMessageDialog(this, state.getUsernameError());
        }
    }

    private static void createDropDownMenu(JPanel panel, SignupState currentState) {
        JButton dropdownButton = new JButton("▼");

        JPopupMenu popUpMenu = new JPopupMenu();

        JCheckBox lactoseIntolerant = new JCheckBox("Lactose Intolerant");
        JCheckBox highBP = new JCheckBox("High Blood Pressure");

        popUpMenu.add(lactoseIntolerant);
        popUpMenu.add(highBP);

        dropdownButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popUpMenu.show(dropdownButton, 0, dropdownButton.getHeight());
            }
        });

        lactoseIntolerant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lactoseIntolerant.isSelected()) {
                    currentState.addRestriction(lactoseIntolerant.getText());
                }
                else {
                    currentState.removeRestriction(lactoseIntolerant.getText());
                }
            }
        });

        highBP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (highBP.isSelected()) {
                    currentState.addRestriction(highBP.getText());
                }
                else {
                    currentState.removeRestriction(highBP.getText());
                }
            }
        });


    }


}