package app;
import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame application = new JFrame("test");
    application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    CardLayout cardLayout = new CardLayout();

    JPanel views = new JPanel(cardLayout);
    application.add(views);

    ViewManagerModel viewManagerModel = new ViewManagerModel();
    new ViewManage(views, cardLayout, viewManagerModel);
}
