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
public class Suitcase {
    private int maxweight;
    private int currentweight;
    private ArrayList<Item> suitcase;

    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
        this.currentweight = 0;
        this.suitcase = new ArrayList();
    }
    
    public void addItem (Item item) {
        if (this.currentweight + item.getWeight() <= this.maxweight) {
            this.suitcase.add(item);
            this.currentweight += item.getWeight();
        }
    }

    @Override
    public String toString() {
        String message = "";
        if (this.suitcase.isEmpty()) {
            message = "no items";
        } else if (this.suitcase.size() == 1) {
            message = "1 item";
        } else {
            message = this.suitcase.size() + " items";
        }
        return (message + " (" + this.currentweight + " kg)");
    }
    
    public void printItems() {
        if (!(this.suitcase.isEmpty())) {
            for (Item item : this.suitcase) {
                System.out.println(item);
            }
        }
    }

    public int totalWeight() {
        return currentweight;
    }
    
    public Item heaviestItem() {
        if (this.suitcase.isEmpty()) {
            return null;
        }
        Item heaviest = this.suitcase.get(0);
        
        for (Item item : this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    
    
    
    
    
}
