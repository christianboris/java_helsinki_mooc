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
    private String name;

    public Container(String name) {
        this.name = name;
        this.value = 0;
        this.max = 100;
    }

    public Container() {        
        this.value = 0;
        this.max = 100;
    }
    
    

    public int contains() {
        return this.value;
    }

    public int getMax() {
        return this.max;
    }
    
    
    
    public void add(int quantity){
        if (quantity > 0){
            this.value += quantity;
        }
        if (this.value > this.max) {
            this.value = this.max; 
        }
    }
    
    public void remove(int quantity){
        if (quantity > 0){
            this.value -= quantity;
        }
        if (this.value < 0) {
            this.value = 0; 
        }
    }

    @Override
    public String toString() {
        return (this.value + "/" + this.max);
    }
    
    public void printContent() {
        System.out.println(this.name +":" + this.value + "/" + this.max);
    }
    
}
