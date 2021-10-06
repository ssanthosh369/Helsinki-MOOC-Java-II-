
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }

        if(!(object instanceof Item)) {
            return false;
        }

        Item compared = (Item) object;

        if(this.name == compared.name) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }



}
