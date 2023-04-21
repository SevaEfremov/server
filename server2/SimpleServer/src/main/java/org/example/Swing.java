package fx;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import javafx.swing.*;


public class Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing and JavaFX");
        JFxpanl jFxpanl = new JFXPanel();
        frame.add(jfxPanel)
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Group gruop = new Group()
        Scene scene = new Scene(gruop, Color.ALICEBLUE)
        group.getChildren().addAll(new Button("press"));
        jfxPanel.setScene(scene);
    }
}
