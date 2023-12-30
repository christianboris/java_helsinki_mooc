/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author CBN
 */
public class JokeManager {
    private ArrayList<String> jokemanager;

    public JokeManager() {
        jokemanager = new ArrayList();
    }
    
    public void addJoke(String joke){
        this.jokemanager.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokemanager.isEmpty()) {
            return ("Jokes are in short supply.");
        }
        Random draw = new Random();
        int index = draw.nextInt(this.jokemanager.size());
        return this.jokemanager.get(index);
    }
    
    public void printJokes() {
        for (String joke : this.jokemanager) {
            System.out.println(joke);
        }
    }
    
    
    
}
