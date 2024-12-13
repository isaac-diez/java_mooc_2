
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {

        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int stock(String product) {
        
        //Recorremos el hashmap de uno en uno y guardamos la entrada en entry
        for (Map.Entry<String, Integer> entry : this.stocks.entrySet()) {
            if (entry.getKey() == product) {
                return entry.getValue();
            }

        }
        return 0;

    }public boolean take(String product) {
        
        
        for (Map.Entry<String, Integer> entry : this.stocks.entrySet()) {
            if (entry.getKey() == product && entry.getValue() > 0) {
                
                //recogemos el valor de stock de la entrada y lo seteamos restandole la unidad que hemos tomado
                entry.setValue(entry.getValue() - 1);
                return true;
            }
        }
        return false;
        
    }

    public int price(String product) {

        for (Map.Entry<String, Integer> entry : this.prices.entrySet()) {
            if (entry.getKey() == product) {
                return entry.getValue();
            }

        }
        return -99;
    }
    
    //Part3
    public Set<String> products() {
        
        Set<String> productsSet = new HashSet<>();
        
        productsSet = this.stocks.keySet();
        
        return productsSet;
        
    }
    
    
}
