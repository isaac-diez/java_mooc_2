
import java.util.HashMap;
import java.util.Map;

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

    public int price(String product) {

        for (Map.Entry<String, Integer> entry : this.prices.entrySet()) {
            if (entry.getKey() == product) {
                return entry.getValue();
            }

        }
        return -99;
    }
}
