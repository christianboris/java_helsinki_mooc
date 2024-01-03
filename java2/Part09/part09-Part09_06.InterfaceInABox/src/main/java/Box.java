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
public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> content;
    

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.content = new ArrayList<Packable>();
    }
    
    public void add(Packable item){
        if (this.weight() + item.weight() <= this.maxCapacity) {
            this.content.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        if (this.content.isEmpty()) {
            return 0.0;
        }
        for (Packable item : content) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return ("Box: " + this.content.size() + " items, total weight " + this.weight() + " kg");
    }
    
    
    
    

}
