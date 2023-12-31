/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Bird {
    private String name;
    private String latin;
    private int number;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.number = 0;
    }

    public void addObservation() {
        this.number += 1;
    }
    
    public void printBird(){
        System.out.println(this.name + " (" + this.latin + "): " + this.number + " observations");
    }

    public String getName() {
        return this.name;
    }
    
    
    
    
    
    
}
