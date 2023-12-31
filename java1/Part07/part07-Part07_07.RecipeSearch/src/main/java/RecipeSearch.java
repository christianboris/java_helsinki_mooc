
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String filename = scanner.nextLine();
        
        Database database = new Database(filename);
        
        System.out.println("");
        System.out.println("Commands");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        
        while(true){
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                database.getAllRecipes();
                System.out.println("");
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String item = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                database.printRecipe(item);
                System.out.println("");
                
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                database.getRecipeByTime(time);
                System.out.println("");
                
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                database.getRecipeByIngredient(ingredient);
                System.out.println("");
            }
        }
    }
    
    

}
