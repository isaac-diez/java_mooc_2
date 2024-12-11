/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class CD implements Packable {
    
    private String artist;
    private String name;
    private int publicationYear;
    private final double WEIGHT = 0.1;
    
    public CD(String artist, String name, int publicationYear){
        
        this.artist = artist;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        
        return this.WEIGHT;
        
    }

    @Override
    public String toString() {
        return this.artist + ": " + name + " (" + publicationYear + ')';
    }
    
    
}
