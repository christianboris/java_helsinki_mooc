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
public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        String value = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return value;
    }
    
}
