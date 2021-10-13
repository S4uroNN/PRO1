package Opgave3pdf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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
        /*
        Circle circle = new Circle(70, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);



        Rectangle bluebox = new Rectangle(50,50,100,50);
        pane.getChildren().add(bluebox);
        bluebox.setFill(Color.BLUE);

        Text text = new Text(90, 80, "Alin");
        pane.getChildren().add(text);
        text.setStroke(Color.RED);

         */

        Circle head = new Circle(100,100,55);
        pane.getChildren().add(head);
        head.setFill(null);
        head.setStroke(Color.BLUE);

        Circle lefteye = new Circle(85,85, 5);
        pane.getChildren().add(lefteye);
        lefteye.setFill(null);
        lefteye.setStroke(Color.BLUE);

        Circle righteye = new Circle(115, 85, 5);
        pane.getChildren().add(righteye);
        righteye.setFill(null);
        righteye.setStroke(Color.BLUE);

        Line mouth = new Line(80,120,120,120);
        pane.getChildren().add(mouth);
        mouth.setStroke(Color.BLUE);






    }
}
