/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author CBN
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start(){
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String word = scanner.nextLine();
                String translation = this.dict.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found.");
                } else {
                    System.out.println("Translation: " + translation);
                }
            }
            System.out.println("Unknown command");
        }
    }
}
