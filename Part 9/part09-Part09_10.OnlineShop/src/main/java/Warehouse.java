import java.util.*;
public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        products = new HashMap<>();
        stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        for(String i: products.keySet()) {
            if(i.equals(product)) {
                return products.get(i);
            }
        }

        return -99;
    }

    public int stock(String product) {
        for(String i: stock.keySet()) {
            if(i.equals(product)) {
                return stock.get(i);
            }
        }

        return 0;
    }

    public boolean take(String product) {
        for(String i: stock.keySet()) {
            if(i.equals(product)) {
                if(stock.get(i) > 0) {
                    stock.put(i,(stock.get(i)-1));
                    return true;
                }
            }
        }

        return false;
    }

    public Set<String> products() {
        Set<String> names = new HashSet<>();

        for(String i: products.keySet()) {
            names.add(i);
        }

        return names;
    }
}
