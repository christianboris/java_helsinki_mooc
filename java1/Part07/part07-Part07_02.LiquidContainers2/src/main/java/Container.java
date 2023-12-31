/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Container {
    private int value;
    private int max;

    public Container() {
        this.value = 0;
        this.max = 100;
    }
    
    public int contains() {
        return this.value;
    }
    
    public void add(int amount) {
        if (amount > 0){
            this.value += amount;
            if (this.value > this.max) {
                this.value = this.max;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0){
            this.value -= amount;
            if (this.value < 0) {
                this.value = 0;
            }
        }
    }

    @Override
    public String toString() {
        return (this.value + "/" + this.max);
    }
    
    
    
    
    
}
