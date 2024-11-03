
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    
    
    //assigns the owner it received as a parameter to a car that corresponds 
    //to the license plate received as a parameter. If the license plate 
    //doesn't have an owner, the method returns true. If the license 
    //already has an owner attached, the method returns false 
    //and does nothing.
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        if (this.owners.containsKey(licensePlate)) {
            
            return false;
        }
        
        this.owners.put(licensePlate, owner);
        
        return true;

    }

    //returns the owner of the car corresponding to the license plate received
    // as a parameter. If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {

        String owner = this.owners.get(licensePlate);
        
        return owner;
    }

    //removes the license plate and attached data from the registry. 
    //The method returns true if removed successfully and false if 
    //the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
        
        if (!this.owners.containsKey(licensePlate)) {
            
            return false;
        }
        
        this.owners.remove(licensePlate);
        
        return true;

    }
    
    public void printLicensePlates() {
        
        for (LicensePlate plate : this.owners.keySet()) {
            
            System.out.println(plate);
            
        }
    }
    
    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();
         for (LicensePlate plate : this.owners.keySet()) {
            
            if (!list.contains(this.owners.get(plate))) {
                  list.add(this.owners.get(plate));
                  System.out.println(this.owners.get(plate));
            }
             
            
        }
        
    }

}
