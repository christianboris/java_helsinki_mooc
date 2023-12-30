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
public class Hold {
    private ArrayList<Suitcase> hold;
    private int maxweight;
    private int currentweight;

    public Hold(int maxweight) {
        hold = new ArrayList();
        this.maxweight = maxweight;
        this.currentweight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currentweight + suitcase.totalWeight() <= this.maxweight) {
            this.hold.add(suitcase);
            this.currentweight += suitcase.totalWeight();
        }
    }

    @Override
    public String toString() {
        return (this.hold.size() + " suitcases (" + this.currentweight + " kg)");
    }
    
    public void printItems() {
        if (!(this.hold.isEmpty())) {
            for (Suitcase suitcase : this.hold) {
                suitcase.printItems();
            }
        }
    }
    
    
    
    
    
}
