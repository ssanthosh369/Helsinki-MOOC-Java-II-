import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Item item) {
        int total = item.getWeight();

        for(Item i: items) {
            total += i.getWeight();
        }

        if(total <= capacity) {
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
