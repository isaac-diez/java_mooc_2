
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;

    // Constructor
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Method to calculate the total price of the item
    public int price() {
        return qty * unitPrice;
    }

    // Method to increase the quantity by one
    public void increaseQuantity() {
        this.qty++;
    }

    // Method to return the string representation of the item
    @Override
    public String toString() {
        return product + ": " + qty;
        
    }
}
