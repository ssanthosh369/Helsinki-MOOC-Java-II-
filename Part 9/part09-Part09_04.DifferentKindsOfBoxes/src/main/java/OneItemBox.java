import java.util.ArrayList;
public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> items;

    public OneItemBox() {
        capacity = 1;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        if(items.size() == 0) {
            items.add(item);
        }
    }

    public boolean isInBox(Item item) {
        for(Item i: items) {
            if(i.equals(item)) {
                return true;
            }
        }

        return false;
    }
}
