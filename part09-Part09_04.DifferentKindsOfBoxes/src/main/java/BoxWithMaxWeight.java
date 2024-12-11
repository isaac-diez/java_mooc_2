
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    //private int currentWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        //this.currentWeight = 0;
        this.items = new ArrayList();
    }

    @Override
    public void add(Item item) {
        
        if (item.getWeight() <= this.capacity) {
            items.add(item);
               
        this.capacity -= item.getWeight();
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
