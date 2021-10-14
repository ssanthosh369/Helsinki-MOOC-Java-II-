
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        ArrayList<String> inputs = new ArrayList<>();

        while(true) {
            String row = scanner.nextLine();

            if(row.equals("end")) {
                break;
            }

            inputs.add(row);

        }

        //System.out.println("Print the average of the negative numbers of the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if(choice.equals("n")) {
            double avg = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(num -> num < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + avg);
        }else if(choice.equals("p")) {
            double avg = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(num -> num >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + avg);
        }
    }
}
