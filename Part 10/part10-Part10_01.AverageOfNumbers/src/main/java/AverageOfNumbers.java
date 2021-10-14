
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        ArrayList<String> input = new ArrayList<>();
        
        while(true) {
            String row = scanner.nextLine();

            if(row.equals("end")) {
                break;
            }

            input.add(row);


        }

        double count = input.stream().mapToInt(s -> Integer.valueOf(s)).count();
        double avg = input.stream().mapToInt(s -> Integer.valueOf(s)).sum()/count;

        System.out.println("average of the numbers: " + avg);
    }
}
