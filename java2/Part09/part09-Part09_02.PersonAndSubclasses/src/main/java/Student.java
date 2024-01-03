/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class Student extends Person {
    private int creditpoints;

    public Student(String name, String address) {
        super(name, address);
        this.creditpoints = 0;
    }
    
    public void study(){
        this.creditpoints ++;
    }
    
    public int credits(){
        return this.creditpoints;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  " + "Study credits " + this.creditpoints;
    }
    
    
    
}
