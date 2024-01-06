package buttonandtextfield;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.FlowPane;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button button = new Button("Click!");
        TextField textfield = new TextField("Here I am");
        
        FlowPane group = new FlowPane();
        group.getChildren().add(button);
        group.getChildren().add(textfield);
        
        Scene view = new Scene(group);
        
        window.setScene(view);
        window.show();
        
    }
    
    

}
