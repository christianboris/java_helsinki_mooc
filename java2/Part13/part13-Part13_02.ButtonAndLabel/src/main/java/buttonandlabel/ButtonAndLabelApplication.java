package buttonandlabel;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.FlowPane;

public class ButtonAndLabelApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        Label text = new Label("Don't wait for anything to happen");
        Button button = new Button ("Click me!");
        
        FlowPane group = new FlowPane();
        group.getChildren().add(text);
        group.getChildren().add(button);
        
        Scene view = new Scene(group);
        
        window.setScene(view);
        window.show();
        
    }
    
    

}
