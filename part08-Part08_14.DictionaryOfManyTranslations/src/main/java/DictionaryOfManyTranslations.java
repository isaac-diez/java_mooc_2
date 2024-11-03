
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> translationsHM;

    public DictionaryOfManyTranslations() {
    
        this.translationsHM = new HashMap<>();
    }
            
    public void add(String word, String translation) {
        
        this.translationsHM.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translationsList = this.translationsHM.get(word);
        
        translationsList.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        
        ArrayList<String> translationsList = new ArrayList<>();
        
        //for (String translation: translationsHM.keySet()) {
        if (translationsHM.containsKey(word)) {
            
            translationsList.addAll(translationsHM.get(word));
            
        }
        return translationsList;
        
    }
    
    public void remove(String word) {
        
        if (translationsHM.containsKey(word)) {
            
            translationsHM.remove(word);
            
        }
        
    }
    
}
