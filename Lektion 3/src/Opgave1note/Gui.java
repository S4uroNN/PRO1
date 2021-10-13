package Opgave1note;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);
        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400,400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        /*
        //First rectangle
        Rectangle box = new Rectangle(200, 20, 60, 60);
        pane.getChildren().add(box);
        box.setFill(Color.YELLOW);
        box.setStroke(Color.BLACK);

        // First Circle
        Circle circle = new Circle(150,50,30);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        //First line
        Line line = new Line(190, 10, 190, 100);
        pane.getChildren().add(line);
        line.setStroke(Color.YELLOW);

         */


        //Main rectangle
        Rectangle box1 = new Rectangle(80,220,150, 150 );
        pane.getChildren().add(box1);
        box1.setFill(Color.GREEN);
        box1.setStroke(Color.BLACK);

        //Dør
        Rectangle door = new Rectangle(100, 310, 40,60);
        pane.getChildren().add(door);

        //vindue
        Rectangle window = new Rectangle(100, 230, 50, 50);
        pane.getChildren().add(window);
        window.setFill(Color.AQUA);
        window.setStroke(Color.BLACK);

        //roof
        Polygon roof = new Polygon(100, 100, 250, 200, 150, 150);
        pane.getChildren().add(roof);
        roof.setFill(Color.RED);
        roof.setStroke(Color.BLACK);



    }
}
