
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int avg = 0;
        
        while(true) {
            int input = scanner.nextInt();

            if(input == 0) {
                if(counter == 0) {
                    System.out.println("Cannot calculate the average");
                }else {
                    System.out.println((1.0 * avg)/counter);
                }
                break;
            }

            if(input > 0) {
                avg += input;
                counter++;
            }
        }


    }
}
