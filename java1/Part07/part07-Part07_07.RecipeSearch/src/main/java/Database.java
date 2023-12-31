/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author CBN
 */
public class Database {
    private ArrayList<String> data;
    private ArrayList<Recipe> database;

    public Database(String filename) {
        this.database = new ArrayList();
        
        Scanner scanner = new Scanner(System.in);
              
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            String name = "";
            int line = 0;
            int time = 0;
            ArrayList<String> data = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                if (!row.isEmpty()) {
                    if (line == 0) {
                        name = row;
                        line ++;
                    } else if (line == 1) {
                        time = Integer.valueOf(row);
                        line++;
                    } else {
                        data.add(row);
                        line++;
                    }
                } else {
                    this.addRecipe(name, time, data);
                    name = "";
                    time = 0;
                    data = new ArrayList<>();
                    line = 0;
                }
            }
            if (!(name.equals(""))){
                this.addRecipe(name, time, data);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    public void printRecipe(String name){
        for (Recipe recipe : this.database) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void getAllRecipes(){
        for (Recipe recipe : this.database) {
            System.out.println(recipe);
        }
    }
    
    public void getRecipeByTime(int time){
        for (Recipe recipe : this.database) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void getRecipeByIngredient(String ingredient){
        for (Recipe recipe : this.database) {
            if (recipe.hasIngredient(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void addRecipe(String name, int time, ArrayList<String> ingredients){
        Recipe recipe = new Recipe(name, time, ingredients);
        this.database.add(recipe);
    }
  
    
    
}
