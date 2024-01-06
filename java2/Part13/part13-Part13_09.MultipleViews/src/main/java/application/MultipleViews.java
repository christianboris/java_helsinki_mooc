package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        
        BorderPane paneFirst = new BorderPane();
        
        Label firstText = new Label("First view!");
        Button firstButton = new Button("To the second view!");
        
        paneFirst.setTop(firstText);
        paneFirst.setCenter(firstButton);
        
        VBox paneSecond = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        paneSecond.getChildren().add(secondButton);
        paneSecond.getChildren().add(secondText);
        
        GridPane paneThird = new GridPane();
        Label thirdText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        paneThird.add(thirdText, 0, 0);
        paneThird.add(thirdButton, 1, 1);
        
        
        Scene first = new Scene(paneFirst);
        Scene second = new Scene(paneSecond);
        Scene third = new Scene(paneThird);
        
        firstButton.setOnAction((event) -> {window.setScene(second);});
        secondButton.setOnAction((event) -> {window.setScene(third);});
        thirdButton.setOnAction((event) -> {window.setScene(first);});
        
        window.setScene(first);
        window.show();
        
        
        
    }
    
    

}
