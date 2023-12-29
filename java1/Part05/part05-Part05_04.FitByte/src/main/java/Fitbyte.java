/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Fitbyte {
    private int restrate;
    private int age;
    
    public Fitbyte(int age, int restrate) {
        this.age = age;
        this.restrate = restrate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (((206.3 - (0.711 * this.age)) - this.restrate) * (percentageOfMaximum) + this.restrate);
    }
    
}
