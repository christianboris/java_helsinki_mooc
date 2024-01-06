package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane pane = new BorderPane();
        
        Label left = new Label("Letters: 0");
        Label center = new Label("Words: 0");
        Label right = new Label("The longest word is:");
        
        HBox bottomBox = new HBox();
        bottomBox.getChildren().add(left);
        bottomBox.getChildren().add(center);
        bottomBox.getChildren().add(right);
             
        pane.setCenter(new TextArea());
        pane.setBottom(bottomBox);
        
        Scene view = new Scene(pane);
        
        window.setScene(view);
        window.show();
        
        
    }
    
    

}
