import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if(history.size() == 0) {
            return 0;
        }else {
            double max = 0;
            for(double i: history) {
                if(max < i) {
                    max = i;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if(history.size() == 0) {
            return 0;
        }else {
            double min = history.get(0);
            for(double i: history) {
                if(min > i) {
                    min = i;
                }
            }
            return min;
        }
    }

    public double average() {

        if(history.size() == 0) {
            return 0;
        }
        
        double total = 0;

        for(double i: history) {
            total += i;
        }

        return total/history.size();
    }




}
