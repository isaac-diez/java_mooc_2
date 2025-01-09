/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author isaac
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {

        this.dictionary = new HashMap<String, String>();

    }

    public SaveableDictionary(String file) {

        this(); //para llamar al constructor anterior sin parámetros e inicializar el HashMap
        
        this.file = file;

    }

    public boolean load() {

        try {
            Files.lines(Paths.get(this.file))
                    .map(line -> line.split(":"))
                    .forEach(parts -> {
                        this.dictionary.put(parts[0], parts[1]);
                    });
            return true;
        } catch (IOException e) {
            return false;
        }

    }
    
    public boolean save() {
        
        try {

            PrintWriter writer = new PrintWriter(new File(file));

            saveWords(writer);

            writer.close();

        } catch (Exception e) {

            return false;

        }

        return true;
        
    }
    
    private void saveWords(PrintWriter writer) throws IOException {

        List<String> alreadySaved = new ArrayList<>();

        dictionary.keySet().stream().forEach(word -> {

            if (alreadySaved.contains(word)) {

                return;

            }

 

            String pair = word + ":" + dictionary.get(word);

            writer.println(pair);

 

            alreadySaved.add(word);

            alreadySaved.add(dictionary.get(word));

        });

    }

    public void add(String words, String translation) {

        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }

    }

    public String translate(String word) {
        String translation = "";

//        Iterator<String> it = this.dictionary.keySet().iterator();
//        while (it.hasNext()) {
//            String itWord = it.next();
//            if (this.dictionary.get(itWord).equals(word)) {
//                translation = itWord;
//            }
//        }
//        return (translation);
        if (dictionary.containsKey(word)) {

            return dictionary.get(word);

        } else if (dictionary.containsValue(word)) {

            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    translation = entry.getKey();
                }
            }
            return translation;

        }

        return null;

    }

    public void delete(String word) {
//    // Remove if the word is a key
//    String translation = this.dictionary.remove(word);
//    
//    System.out.println("translation: " + translation);
//    
//    // If the word was a key, remove its translation as well
//    if (translation != null) {
//        this.dictionary.remove(translation);
//    } else {
//        // If the word wasn't a key, check if it's a value
//        for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
//            if (entry.getValue().equals(word)) {
//                this.dictionary.remove(entry.getKey());
//                break;
//            }
//        }
//    }

        String translation = translate(word);

        dictionary.remove(word);

        dictionary.remove(translation);

    }

}
