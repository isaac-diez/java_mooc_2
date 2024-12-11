
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
public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity){
        
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();      
        
    }
    
    public void add(Packable item){
        
        if (item.weight() + currentWeight() <= this.maxCapacity) {
            items.add(item);
        }
        
    }
    
    public double currentWeight(){
        
        double currentWeight = 0;
        
        for (Packable item : items){
            currentWeight += item.weight();
        }
        
        return currentWeight;
        
    }

    @Override
    public double weight() {
        return currentWeight();
                
    }
    
    @Override 
    public String toString() { 
        return "Box: " + items.size() + " items, total weight " + currentWeight() + " kg"; }
    
}
