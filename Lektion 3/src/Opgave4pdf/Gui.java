package Opgave4pdf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

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
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {

        Circle outerCircle = new Circle(100,100,60);
        pane.getChildren().add(outerCircle);
        outerCircle.setFill(null);
        outerCircle.setStroke(Color.BLACK);
        outerCircle.setStrokeWidth(10.0);

        Circle secondCircle = new Circle(100,100,40);
        pane.getChildren().add(secondCircle);
        secondCircle.setFill(null);
        secondCircle.setStroke(Color.BLACK);
        secondCircle.setStrokeWidth(10.0);

        Circle innerCircle = new Circle(100,100,20);
        pane.getChildren().add(innerCircle);
        innerCircle.setFill(null);
        innerCircle.setStroke(Color.BLACK);
        innerCircle.setStrokeWidth(10.0);

        Circle dot = new Circle(100,100,5);
        pane.getChildren().add(dot);
        dot.setFill(Color.BLACK);



    }
}
