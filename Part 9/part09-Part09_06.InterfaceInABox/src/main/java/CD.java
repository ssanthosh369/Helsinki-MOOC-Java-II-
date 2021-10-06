public class CD implements Packable{
    private String artist;
    private String name;
    private int year;
    private double weight;

    public CD(String a, String n, int y) {
        artist = a;
        name = n;
        year = y;
        weight = 0.1;
    }

    

    public double weight() {
        return weight;
    }

    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }
}
