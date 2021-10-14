import java.util.ArrayList;
import java.util.Collections;
public class Hand implements Comparable<Hand>{ 
    private ArrayList<Card> h;

    public Hand() {
        h = new ArrayList<>();
    }

    public void add(Card card) {
        h.add(card);
    }

    public void print() {
        h.stream().forEach(s -> System.out.println(s));
    }

    public int totalValue() {
        return h.stream().map(s -> s.getValue()).reduce(0, (previoussum, sum) -> previoussum + sum);
    }

    public void sort() {
        h.stream().sorted().forEach(s -> System.out.println(s));
    }

    public int compareTo(Hand hand) {
        if(this.totalValue() < hand.totalValue()) {
            return -1;
        }else if(this.totalValue() > hand.totalValue()) {
            return 1;
        }else {
            return 0;
        }
    }

    public void sortBySuit() {
        BySuitInValueOrder sort = new BySuitInValueOrder();

        Collections.sort(h, sort);
        //this.print();
    }


}
