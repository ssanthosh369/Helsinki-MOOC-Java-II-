import java.util.*;
public class Herd implements Movable{
    private List<Movable> org;

    public Herd() {
        org = new ArrayList<>();
    }

    public String toString() {
        String output = "";
        for(Movable i: org) {
            output += ("\n" + i);
        }
        return output.trim();
    }

    public void addToHerd(Movable movable) {
        org.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable i: org) {
            i.move(dx,dy);
        }
    }
}
