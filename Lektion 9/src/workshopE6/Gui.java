package workshopE6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application
{
    

    @Override
    public void start(Stage stage)
    {
        GridPane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops");
        stage.setScene(scene);
        stage.show();
    }

    private GridPane initContent()
    {
        GridPane pane = new GridPane();
        Canvas canvas = new Canvas(300, 300);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc)
    {
        gc.strokeLine(0,20,280,20); // Axis
        int xa = 280;
        int ya = 20;
        //arrowhead
        gc.strokeLine(xa,ya,xa-10,ya-4);
        gc.strokeLine(xa,ya,xa-10,ya+4);

         int y1 = 15;
         int y2 = 25;
         for(int i = 0; i < 26;i++){
             int x = 10 + i * 10;
             if(i % 5 == 0){
                 gc.strokeLine(x,y1-5,x,y2+5);
                 gc.fillText(String.valueOf(i),x,y1-5);
             }
             gc.strokeLine(x,y1,x,y2);
         }
    }
}
