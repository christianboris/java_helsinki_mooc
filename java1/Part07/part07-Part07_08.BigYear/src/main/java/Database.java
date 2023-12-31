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
public class Database {
    private ArrayList<Bird> database;

    public Database() {
        database = new ArrayList();
    }
    
    public void addBird(String name, String latinname){
        this.database.add(new Bird(name, latinname));
    }
    
    public void addObservation(String name){
        for (Bird bird: this.database) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
            }
        }
    }
    
    public boolean hasBird(String name){
        for (Bird bird: this.database) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        
        return false;
    }
    
    public void printAll() {
        for (Bird bird : this.database){
            bird.printBird();
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: this.database) {
            if (bird.getName().equals(name)) {
                bird.printBird();
            }
        }
    }
    
    
}
