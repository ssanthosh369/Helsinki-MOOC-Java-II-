
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(s -> s.split(",")).sorted((p1,p2) -> {
                return p1[5].compareTo(p2[5]);
            })
            .map(a -> a[3].trim() + " (" + a[4].trim() + "), " + a[2].trim().split(" ")[0] + ", " + a[5].trim())
            .forEach(x -> System.out.println(x));
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
