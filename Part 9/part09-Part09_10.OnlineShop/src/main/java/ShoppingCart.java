import java.util.*;
public class ShoppingCart {
    private Map<String,Item> items;

    public ShoppingCart() {
        items = new HashMap<String,Item>();
    }

    public void add(String product, int price) {
        if(items.containsKey(product)) {
            items.get(product).increaseQuantity();
        }else {
            items.put(product, new Item(product,1, price));
        }
    }

    public int price() {
        int p = 0;

        for(Item i: items.values()) {
            p += i.price();
        }
        
        return p;
    }

    public void print() {
        for(Item i: items.values()) {
            System.out.println(i);
        }
    }
}
