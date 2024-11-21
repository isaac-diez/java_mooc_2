/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isaac
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        
        super(productName,capacity);
        history = new ChangeHistory();
        addToWarehouse(initialBalance);
        
        
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double takenAmount = super.takeFromWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        history.add(getBalance());
        return takenAmount;
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        history.add(getBalance());
    }
    
    public void printAnalysis() {
        
     System.out.println(
             "Product: " + super.getName() +"\n" +
             "History: " +history.toString() + "\n" +
             "Largest amount of product: " + history.maxValue()+"\n" +
             "Smallest amount of product: " + history.minValue()+"\n" +
             "Average: " + history.average());
        
    }
    
    public String history() {
        return history.toString();
    }
    
    
}
