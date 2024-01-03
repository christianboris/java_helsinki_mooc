/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author CBN
 */
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double status){
        this.history.add(status);
        
    }
    
    public void clear(){
        this.history.clear();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue(){
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double maxEntry = this.history.get(0);
            for (double value : this.history) {
                if (value > maxEntry) {
                    maxEntry = value;
                }
            }
            return maxEntry;
        }
    }
        
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double minEntry = this.history.get(0);
            for (double value : this.history) {
                if (value < minEntry) {
                    minEntry = value;
                }
            }
            return minEntry;
        }
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double total = 0;
            for (double value : this.history) {
                total += value;
                }
            return total / this.history.size();
        }
            
    }
}
