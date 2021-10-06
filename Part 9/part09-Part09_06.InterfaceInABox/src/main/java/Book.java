public class Book implements Packable{
    private String name;
    private String author;
    private double weight;

    public Book(String a, String n, double w) {
        author = a;
        name = n;
        weight = w;
    }

    public double weight() {
        return weight;
    }

    public String toString() {
        return author + ": " + name;
    }
    
}
