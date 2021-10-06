import java.util.HashMap;
public class Abbreviations {
    private HashMap<String,String> ab;

    public Abbreviations() {
        ab = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        ab.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
         return ab.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return ab.get(abbreviation);
    }
}
