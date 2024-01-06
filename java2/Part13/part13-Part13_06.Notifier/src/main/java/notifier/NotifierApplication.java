package notifier;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        TextField text = new TextField();
        Button button = new Button("Update");
        Label label = new Label();
        
        VBox box = new VBox();
        box.getChildren().add(text);
        box.getChildren().add(button);
        box.getChildren().add(label);
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        Scene view = new Scene(box);
        
        window.setScene(view);
        window.show();
        
        
        
        
    }
    
    

}
