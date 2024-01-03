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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        if (this.capacity >= this.getWeight() + item.getWeight()) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    public int getWeight() {
        int total = 0;
        for (Item item : items){
            total += item.getWeight();
        }
        return total;
    }
}
