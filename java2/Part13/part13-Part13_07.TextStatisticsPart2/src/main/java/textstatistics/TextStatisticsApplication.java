package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.Arrays;


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
        
        TextArea inputText = new TextArea();
        
        pane.setCenter(inputText);
        pane.setBottom(bottomBox);
        
        Scene view = new Scene(pane);
        
        inputText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            // set values of text elements
            left.setText("Letters: " + characters);
            center.setText("Words: " + words);
            right.setText("The longest word is: " + longest);
            
            
        });
        
        
             

        
        window.setScene(view);
        window.show();
        
        
    }
    
    

}
