package application;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
    private HashMap<String, HashMap<Integer, Double>> values;

    public static void main(String[] args) {
        
        launch(PartiesApplication.class);
    }
    
    
    public void readFile(HashMap<String, HashMap<Integer, Double>> dataPoints) {
        String filename = "partiesdata.tsv";
       
        // {Party : {Year : value, Year : valu, Year : value} ... etc}
        
        ArrayList<Integer> years = new ArrayList<>();
        
        try (Scanner data = new Scanner(Paths.get(filename))) {
            String row = data.nextLine();
            String[] dataArr = row.split("\t");
            for (int i = 1; i < dataArr.length; i++) {
                years.add(Integer.valueOf(dataArr[i]));
            }
            
            while (data.hasNext()){
                String line = data.nextLine();
                dataArr = line.split("\t");
                HashMap<Integer, Double> timeseries = new HashMap<>();
                
                for (int i = 1; i < dataArr.length; i++) {
                    if (!dataArr[i].equals("-")) {
                        timeseries.put(years.get(i - 1), Double.valueOf(dataArr[i]));
                    }
                }
                dataPoints.put(dataArr[0], timeseries);
            }            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    
    @Override
    public void start(Stage stage) {
        this.values = new HashMap<>();
        readFile(this.values);
        
        
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 1);
        NumberAxis yAxis = new NumberAxis(0,30, 1);

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }   

}
