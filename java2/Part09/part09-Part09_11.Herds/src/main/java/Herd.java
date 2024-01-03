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
public class Herd implements Movable {
    
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList();
    }

    @Override
    public String toString() {
        String output = "\n";
        for (Movable element : this.herd){
            output += "\n" + element.toString();
        }
        return output;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for (Movable element : this.herd) {
            element.move(dx, dy);
        }
    }    
}
