package app;

import data_access.DataAccessObject;
import entity.CommonUserProfileFactory;
import interface_adapter.Logged_in.LoggedInViewModel;
import interface_adapter.Login.LoginViewModel;
import interface_adapter.Signup.SignupViewModel;
import interface_adapter.ViewManagerModel;

//import view.LoggedInView;
import view.LoginView;
import view.SignupView;
import view.ViewManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Meal-Recipe-App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,500);
        frame.setLocationRelativeTo(null);

        CardLayout cardLayout = new CardLayout();
        JPanel currentView = new JPanel(cardLayout);



        frame.setVisible(true);

        JPanel views = new JPanel(cardLayout);
        frame.add(currentView);

        // The ViewManager model controls which of the view are currently being displayed.
        ViewManagerModel viewManagerModel = new ViewManagerModel();
        new ViewManager(currentView, cardLayout, viewManagerModel);

        // The data for the views, such as username and password, are in the ViewModels.
        // This information will be changed by a presenter object that is reporting the
        // results from the use case. The ViewModels are observable, and will
        // be observed by the Views.
        LoginViewModel loginViewModel = new LoginViewModel();
        LoggedInViewModel loggedInViewModel = new LoggedInViewModel();
        SignupViewModel signupViewModel = new SignupViewModel();

        DataAccessObject userDataAccessObject;
        try {
            userDataAccessObject = new DataAccessObject("./userProfiles.csv", new CommonUserProfileFactory());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        SignupView signupView = SignupUseCaseFactory.create(viewManagerModel, loginViewModel, signupViewModel,
                userDataAccessObject);
        views.add(signupView, signupView.viewName);

        LoginView loginView = LoginUseCaseFactory.create(viewManagerModel, loginViewModel, loggedInViewModel, userDataAccessObject);
        views.add(loginView, loginView.viewName);

//        LoggedInView loggedInView = new LoggedInView(loggedInViewModel);
//        views.add(loggedInView, loggedInView.viewName);

        viewManagerModel.setActiveView(signupView.viewName);
        viewManagerModel.firePropertyChanged();

        frame.pack();
        frame.setVisible(true);
    }
}
