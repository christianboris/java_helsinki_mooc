/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author CBN
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<>();
    }
    
    
    public void addSensor(Sensor SensortoAdd){
        sensors.add(SensortoAdd);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors){
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors){
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty()){
            throw new IllegalStateException("No sensors");
        }
        
        if (!this.isOn()) {
                throw new IllegalStateException("At least one sensor is off");
            }

        double total = sensors.stream()
                .map(s -> s.read())
                .reduce(0, (prev, curr) -> prev + curr); 

        int avg = (int)(total / this.sensors.size());
        this.readings.add(avg);
        
        return (avg);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor: this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        
        return true;

    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
