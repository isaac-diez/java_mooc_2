/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class ProductWarehouse extends Warehouse {
    
    private String product;

    public ProductWarehouse(String product, double capacity) {
        super(capacity);
        this.product = product;
    }
    
    public String getName() {
        return product;
    }

    public void setName(String product) {
        this.product = product;
    }
    
    public String getProduct() {
        return product;
    }
    
    public String toString() {
        
        //Juice: balance = 64.5, space left 123.5
        
        return this.product + " : balance = " + super.getBalance() + ", space left " + (super.getCapacity()-super.getBalance()); 

    }
    
}
