package application;

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;


import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {
        
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage window) {

        // Create general layout (Top layer)
        BorderPane layout = new BorderPane();
        
        // set chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart(xAxis, yAxis);
        lineChart.setAnimated(false);
        
        XYChart.Series dataSaved = new XYChart.Series();
        XYChart.Series dataAccrued = new XYChart.Series();
        
        
        lineChart.setTitle("Savings Calculator");
        dataSaved.setName("Savings with Interest");
        dataAccrued.setName("Savings without Interest");
        
        
        lineChart.getData().add(dataSaved);
        lineChart.getData().add(dataAccrued);
        
        layout.setCenter(lineChart);
        
        // Top box with sliders (Second layer)
        VBox controls = new VBox();
        
        // Savings slider box (Third layer 1)
        BorderPane savingsPane = new BorderPane();
        
        Label savingsLabel = new Label("Monthly savings");
        
        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setSnapToTicks(true);
        savingsSlider.setBlockIncrement(500);
        savingsSlider.setShowTickMarks(true); // needs this stuff or the automated test will have an issue
        savingsSlider.setShowTickLabels(true); // needs this stuff or the automated test will have an issue
        
      
        Label savingsSliderLabel = new Label(String.valueOf(savingsSlider.getValue()));
        
        // Put everything into the savings slider box
        savingsPane.setLeft(savingsLabel);
        savingsPane.setCenter(savingsSlider);
        savingsPane.setRight(savingsSliderLabel);
        
        // Interest slider box (Third layer 2)
        BorderPane interestPane = new BorderPane();
        Label interestLabel = new Label("Yearly interest rate");
        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setMinorTickCount(10);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        
        Label interestSliderLabel = new Label(String.valueOf(interestSlider.getValue()));
        
        // Put everything into the interest slider box
        interestPane.setLeft(interestLabel);
        interestPane.setCenter(interestSlider);
        interestPane.setRight(interestSliderLabel);
        
        // now add boxes to the second layer
        controls.getChildren().add(savingsPane);
        controls.getChildren().add(interestPane);
        
        // And finally all the layouts into the top layer
        layout.setTop(controls);
        
        
        // the techy stuff that calls the interest calculation
        savingsSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    
                    public void changed(ObservableValue <? extends Number > 
                                observable, Number oldValue, Number newValue)
                    {
                        savingsSliderLabel.setText(String.valueOf(savingsSlider.getValue()));
                        calc(savingsSlider.getValue(), interestSlider.getValue(), dataSaved, dataAccrued);

                    }
                });
        
        
        interestSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    
                    public void changed(ObservableValue <? extends Number > 
                                observable, Number oldValue, Number newValue)
                    {
                        interestSliderLabel.setText(String.valueOf(interestSlider.getValue()));
                        calc(savingsSlider.getValue(), interestSlider.getValue(), dataSaved, dataAccrued);

                    }
                });
        
        // initialize graph
        calc(savingsSlider.getValue(), interestSlider.getValue(), dataSaved, dataAccrued);

        // set a window size for the automated test to catch the slider
        Scene view = new Scene(layout, 640, 480);

        window.setScene(view);
        window.show();
    }
    
    public void calc(double savings, double interest, XYChart.Series dataSaved, XYChart.Series dataSavedAccrued ){
        
        
        dataSaved.getData().clear();
        dataSavedAccrued.getData().clear();
        
        dataSaved.getData().add(new XYChart.Data(0, 0));
        dataSavedAccrued.getData().add(new XYChart.Data(0, 0));
        
        
        double saved = 0.0;
        double accrued = 0.0;
        
        for (int i = 0; i < 31; i++) {
            
            dataSaved.getData().add(new XYChart.Data(i, saved));
            dataSavedAccrued.getData().add(new XYChart.Data(i, accrued));
            
            
            saved += savings * 12;
            // not noted in text, but assumes that savings in a year already earn interest.
            // fails if calculated without savings in current year
            accrued = (accrued + savings * 12) * (1.0 + interest / 100.0) ;


            
        }
        
    }
}