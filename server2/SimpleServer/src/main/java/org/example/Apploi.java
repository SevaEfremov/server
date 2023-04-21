import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.swing.*;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Slider sliderH = new Slider();
        Slider sliderV = new Slider();
        SliderH.setMax(100);
        SliderV.setValue(100);
        SliderH.setValue(0);
        SliderV.setMax(0);
        sliderH.setShowTickLabels(true);
        sliderV.setShowTickLabels(true);
        sliderH.setShowTickMarks(true);
        sliderV.setShowTickMarks(true);
        sliderV.setOrientation(Orientation.VERTICAL);

        Pane pane = new Pane();
        Text text = new Text("Olympic Games");
        text.setX(0);
        text.setY(0);
        pane.getChildren().add(text);

        sliderH.valueChangingProperty().addListener(InvalidationListener {
            @Override
            public void Invalidated(Observable observable) {
                text.setX(sliderH.getValue()* pane.getWidth()/100);
            }
        };

        sliderV.valueChangingProperty().addListener(InvalidationListener {
            @Override
            public void Invalidated(Observable observable) {
                text.setY((sliderV.getMax() - sliderV.getValue())* pane.getWidth()/100);
            }
        };

        borderPane.setCenter(pane);
        borderPane.setBottom(sliderH);
        borderPane.setRight(sliderV);


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { Launch(args); }
}
