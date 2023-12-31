
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Database database = new Database();
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            String input = scan.nextLine();
            System.out.print("?");
            
            if (input.equals("Quit")) {
                break;
            }
            
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();
                database.addBird(name, latin);
            } else if (input.equals("Observation")){
                System.out.println("Bird? ");
                String name = scan.nextLine();
                if (database.hasBird(name)) {
                    database.addObservation(name);
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("All")) {
                database.printAll();
            } else if (input.equals("One")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                if (database.hasBird(name)) {
                    database.printOne(name);
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }

    }

}
