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
    
    private ArrayList<String> todo;

    public TodoList() {
        todo = new ArrayList();
    }
    
    public void add(String task) {
        this.todo.add(task);
    }
    
    public void print() {
        if (!(this.todo.isEmpty())) {
            int counter = 1;
            for (String task : this.todo) {
                System.out.println(counter +": " + task);
                counter += 1;
            }
        }
    }
    
    public void remove(int number) {
        if (!(this.todo.isEmpty())) {
            this.todo.remove(number - 1);
        }
    }
    
    
    
    
}
