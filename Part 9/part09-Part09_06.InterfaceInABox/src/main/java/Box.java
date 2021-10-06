import java.util.ArrayList;
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double c) {
        capacity = c;
        items = new ArrayList<>();
    }

    public double weight() {
        double total = 0;

        for(Packable i:items) {
            total += i.weight();
        }

        return total;
    }
    public void add(Packable item) {
        if(item.weight() + weight() <= capacity) {
            items.add(item);
        }
    }

    public String toString() {
        return "Box: " + items.size() + " items, total weight " + weight() + " kg";
    }
}
