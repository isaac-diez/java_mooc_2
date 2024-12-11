
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Abbreviations {
    
    private HashMap<String,String> abbreviations;
    
    public Abbreviations() {
        
        this.abbreviations = new HashMap<>();
        
    }
    
    public void addAbbreviation(String part,String explanation) {
        
        if (!hasAbbreviation(part)) {
            this.abbreviations.put(part, explanation);
        } else {
            System.out.println("Already stored!");
        }
        
    }
    
    public boolean hasAbbreviation(String part) {
        
        if (this.abbreviations.containsKey(part)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public String findExplanationFor(String abbreviation) {
        
        String explanation = this.abbreviations.get(abbreviation);
        
        return explanation;
        
    }
    
}
