
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageHM;

    public StorageFacility() {
        this.storageHM = new HashMap<>();
    }

    public void add(String unit, String item) {

        this.storageHM.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> storageList = this.storageHM.get(unit);

        storageList.add(item);

    }

    public ArrayList<String> contents(String storageUnit) {

        ArrayList<String> storageList = new ArrayList<>();

        if (this.storageHM.containsKey(storageUnit)) {
            storageList.addAll(this.storageHM.get(storageUnit));
        }

        return storageList;

    }

    public void remove(String storageUnit, String item) {

        if (storageHM.containsKey(storageUnit)) {

            ArrayList<String> items = storageHM.get(storageUnit);

            items.remove(item);

            if (items.isEmpty()) {
                storageHM.remove(storageUnit);
            }

        }

    }
        
    public ArrayList<String> storageUnits() {
        
        ArrayList<String> storageUnitsList = new ArrayList<>();

        for (String unit: this.storageHM.keySet()) {
            if (!storageHM.get(unit).isEmpty()) {
                storageUnitsList.add(unit);
            }
        }

        return storageUnitsList;
        
    }
     
}
