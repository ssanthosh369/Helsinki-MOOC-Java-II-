import java.util.*;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dic;

    public DictionaryOfManyTranslations() {
        dic = new HashMap<>();
    }

    public void add(String word, String translation) {
        if(!(dic.containsKey(word))) {
            dic.put(word,new ArrayList<String>());          
        }

        dic.get(word).add(translation);
        
    }

    public ArrayList<String> translate(String word) {
        return dic.getOrDefault(word, new ArrayList<String>());
    }

    public void remove(String word) {
        dic.remove(word);
    }
}

