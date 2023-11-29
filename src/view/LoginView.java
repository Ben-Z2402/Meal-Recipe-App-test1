package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeListener;

public class LoginView extends JPanel implements ActionListener, PropertyChangeListener {
{

    public final String viewName = "log in";
    final LoginViewModel loginViewModel;

    final JTextField usernameInputField = new JTextField(15);
    final JLabel usernameErrorField = new JLabel();

    final JPasswordField passwordInputField = new JPasswordField(15);
    final JLabel passwordErrorField = new JLabel();

    final JButton logIn;
    final JButton cancel;

    public LoginView(LoginViewModel loginViewModel) {
        this.loginViewModel = loginViewModel;
        this.loginViewModel.addPropertyChangeListener(this);

        JLabel title = new JLabel("Login Screen");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        LabelTextPanel usernameInfo = new LabelTextPanel(
                new JLabel("Username"), usernameInputField);
        LabelTextPanel passwordInfo = new LabelTextPanel(
                new JLabel("Password"), passwordInputField);

        JPanel buttons = new JPanel();
        logIn = new JButton(loginViewModel.LOGIN_BUTTON_LABEL);
        buttons.add(logIn);
        cancel = new JButton(loginViewModel.CANCEL_BUTTON_LABEL);
        buttons.add(cancel);

        logIn.addActionListener(this);
        cancel.addActionListener(this);

        usernameInputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                loginViewModel.getState().setUsername(usernameInputField.getText());
                loginViewModel.firePropertyChanged();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                loginViewModel.getState().setUsername(usernameInputField.getText());
                loginViewModel.firePropertyChanged();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                loginViewModel.getState().setUsername(usernameInputField.getText());
                loginViewModel.firePropertyChanged();
            }
        });

        passwordInputField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                loginViewModel.getState().setPassword(passwordInputField.getText());
                loginViewModel.firePropertyChanged();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                loginViewModel.getState().setPassword(passwordInputField.getText());
                loginViewModel.firePropertyChanged();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                loginViewModel.getState().setPassword(passwordInputField.getText());
                loginViewModel.firePropertyChanged();
            }
        });

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(title);
        add(usernameInfo
}
