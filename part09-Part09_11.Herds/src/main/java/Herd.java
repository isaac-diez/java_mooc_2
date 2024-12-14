
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Herd implements Movable{
    
    private ArrayList<Movable> herd;
    
    public Herd(){
        
        this.herd = new ArrayList<>();
        
    }
    
    public void addToHerd(Movable movable) {
        
        this.herd.add(movable);
        
    }

    @Override
    public void move(int dx, int dy) {
        
        for (Movable organism : herd){
            organism.move(dx, dy);
        }
        
    }
    
    public String toString() {
        
        String value = "";
        
        for (Movable organism : herd) {
            
            value +=  organism.toString()+"\n";
            
        }
        
        return value;
     
    }
    
    
}
