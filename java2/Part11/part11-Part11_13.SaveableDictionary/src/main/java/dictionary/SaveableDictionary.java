/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

/**
 *
 * @author CBN
 */
public class SaveableDictionary {

    private HashMap <String, String> dict;
    private String file;
    
    public SaveableDictionary(){
        this.dict = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        
        this.file = file;
        
    }
    
    public boolean load(){
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                this.dict.put(line.split(":")[0], line.split(":")[1]);
            }
            
            return true;
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save(){
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dict.keySet()) {
                writer.println(key +":" + this.dict.get(key));
            }
            
            return true;
        } catch (Exception e) {
            System.out.println("Error writing file " + e.getMessage());
            return false;
        }
    }
    
    public void add(String words, String translation){
        if (!this.dict.containsKey(words)) {
            this.dict.put(words, translation);
        }
    }
    
    public String translate(String word){
        if (this.dict.containsKey(word))
        {
            return this.dict.get(word);
        } 
        if (this.dict.containsValue(word))
        {
            for (String key: this.dict.keySet()){
                if (this.dict.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
    }
    
    public void delete(String word){
        this.dict.remove(word);
        this.dict.remove(this.translate(word));
    }
    
}
