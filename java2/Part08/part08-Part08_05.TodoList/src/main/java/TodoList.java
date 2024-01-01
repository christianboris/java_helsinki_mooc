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
public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<String>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        if (!(this.list.isEmpty())) {
            int counter = 1;
            for (String task : this.list){
                System.out.println(counter + ": "+ task);
                counter++;
            }
        }
    }
    
    public void remove(int number){
        if (!(this.list.isEmpty())){
            this.list.remove(number - 1);
        }
    }
}
