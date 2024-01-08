package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.scene.paint.Color;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
    
    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        //paintingLayout.setRight(colorPalette);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        

        painter.setFill(Color.BLACK);
        painter.fillRect(175, 150, 25, 25);
        painter.fillRect(275, 150, 25, 25);
        
        painter.fillRect(175, 300, 125, 25); 
        painter.fillRect(150, 275, 25, 25);
        painter.fillRect(300, 275, 25, 25);
        

        
        
        window.setScene(view);
        window.show();
    }
}
    
