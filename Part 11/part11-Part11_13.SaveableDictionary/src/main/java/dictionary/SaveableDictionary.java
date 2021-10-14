package dictionary;

import java.util.*;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class SaveableDictionary {
    private HashMap<String, String> dic;
    private String file;

    public SaveableDictionary() {
        dic = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        dic = new HashMap<>();
        this.file = file;
    }

    public boolean load() {

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            dic.clear();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                dic.put(parts[0], parts[1]);
            }
            return true;

        } catch (Exception e) {
            return false;
            // TODO: handle exception
        }

    }

    public boolean save() {
        try (PrintWriter pr = new PrintWriter(file)) {
            for(String i: dic.keySet()) {
                pr.println(i+":"+dic.get(i));
            }
            pr.close();
            return true;
        } catch (Exception e) {
            return false;
            //TODO: handle exception
        }
    }

    public void add(String words, String translation) {
        if (!dic.containsKey(words)) {
            dic.put(words, translation);
        }
    }

    public String translate(String word) {
        if (dic.containsKey(word)) {
            return dic.get(word);
        }

        if (dic.containsValue(word)) {
            for (String i : dic.keySet()) {
                if (dic.get(i).equals(word)) {
                    return i;
                }
            }
        }

        return null;
    }

    public void delete(String word) {
        if (dic.containsKey(word)) {
            dic.remove(word);
        }

        if (dic.containsValue(word)) {
            for (String i : dic.keySet()) {
                if (dic.get(i).equals(word)) {
                    dic.remove(i);
                    break;
                }
            }
        }
    }
}
