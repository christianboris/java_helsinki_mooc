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
public class Recipe {
    private String name;
    private int time;
    ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList();
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return (this.name + ", cooking time: " + this.time);
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    
    public boolean hasIngredient(String ingredient){
        return this.ingredients.contains(ingredient);
    }
    
}
