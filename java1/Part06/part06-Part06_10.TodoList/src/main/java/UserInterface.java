/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author CBN
 */
public class UserInterface {
    private TodoList todos;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String adding = scanner.nextLine();
                todos.add(adding);
            } else if (command.equals("list")) {
                this.todos.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one to remove? ");
                int removeindex = Integer.valueOf(scanner.nextLine());
                this.todos.remove(removeindex);
                
            }
            
        }
            
    }
    
    
    
}
