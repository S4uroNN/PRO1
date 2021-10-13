package creativedrawing;

import com.sun.javafx.scene.shape.LineHelper;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.util.concurrent.RecursiveAction;

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
        //Background
        Rectangle background = new Rectangle(0,0, 400,380);
        pane.getChildren().add(background);
        background.setFill(Color.LIGHTBLUE);

        Circle sun = new Circle(300,80,40);
        pane.getChildren().add(sun);
        sun.setFill(Color.YELLOW);
        sun.setStroke(Color.BLACK);

        Rectangle grass = new Rectangle(0,380, 400,20);
        pane.getChildren().add(grass);
        grass.setFill(Color.LIGHTGREEN);

        // Car building
        Rectangle body = new Rectangle(40,300,285,70);
        pane.getChildren().add(body);
        body.setFill(Color.RED);
        body.setStroke(Color.BLACK);

        Polygon roof = new Polygon(270,300, 80,300,120,250,220,250);
        pane.getChildren().add(roof);
        roof.setFill(Color.RED);
        roof.setStroke(Color.BLACK);

        Ellipse doorHandleFront = new Ellipse(190, 325, 8, 5);
        pane.getChildren().add(doorHandleFront);

        Ellipse doorHandleRear = new Ellipse(110,325,8,5);
        pane.getChildren().add(doorHandleRear);


        Polygon frontWindow = new Polygon(260,300,95,300,125,255,215,255);
        pane.getChildren().add(frontWindow);
        frontWindow.setFill(Color.LIGHTBLUE);
        frontWindow.setStroke(Color.BLACK);

        Line bPillar = new Line(170,255,170 ,370 );
        pane.getChildren().add(bPillar);
        bPillar.setStrokeWidth(2);

        Line aPillar = new Line(95,300,95,370);
        pane.getChildren().add(aPillar);
        aPillar.setStrokeWidth(2);

        Line cPillar = new Line(260,300,260,370);
        pane.getChildren().add(cPillar);
        cPillar.setStrokeWidth(2);

        Circle frontRim = new Circle(280,360,20);
        pane.getChildren().add(frontRim);
        frontRim.setFill(Color.GREY);
        frontRim.setStroke(Color.BLACK);
        frontRim.setStrokeWidth(5);

        Circle rearRim = new Circle(95,360,20);
        pane.getChildren().add(rearRim);
        rearRim.setFill(Color.GREY);
        rearRim.setStroke(Color.BLACK);
        rearRim.setStrokeWidth(5);

        //Road
        Line road = new Line(0,380,400,380);
        pane.getChildren().add(road);
        road.setStrokeWidth(5);








    }
}
