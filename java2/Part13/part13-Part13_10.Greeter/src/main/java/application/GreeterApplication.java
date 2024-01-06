package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window){
        
        // First scene
        Label instructionText = new Label("Enter your name and start");
        TextField input = new TextField();
        Button startButton = new Button("Start");
        
        VBox paneFirst = new VBox();
        paneFirst.getChildren().add(instructionText);
        paneFirst.getChildren().add(input);
        paneFirst.getChildren().add(startButton);
        
        Scene firstScene = new Scene(paneFirst);
        
        // Second Scene
        Label greetingText = new Label("Welcome");
        
        VBox paneSecond = new VBox();
        paneSecond.getChildren().add(greetingText);
             
        Scene secondScene = new Scene(paneSecond);
        
        startButton.setOnAction((event) -> { 
            String name = input.getText();
            greetingText.setText("Welcome " + name + "!");
            window.setScene(secondScene);
        });
        
        window.setScene(firstScene);
        window.show();
        
    }
    
    
    
    
    
}
