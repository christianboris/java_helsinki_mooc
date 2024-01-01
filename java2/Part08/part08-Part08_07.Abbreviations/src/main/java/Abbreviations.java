/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author CBN
 */
public class Abbreviations {
    private HashMap<String, String> dict;
    

    public Abbreviations() {
        dict = new HashMap();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.dict.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (this.dict.isEmpty()) {
            return false;
        }
        
        return this.dict.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation){
        return this.dict.get(abbreviation);
    }
    
    
    
    
}
