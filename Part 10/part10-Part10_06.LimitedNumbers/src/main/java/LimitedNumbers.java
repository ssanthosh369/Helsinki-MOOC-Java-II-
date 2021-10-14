
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<>();

        while(true) {
            int num = scanner.nextInt();
            if(num < 0) {
                break;
            }

            input.add(num);
        }

        input.stream().filter(num -> num > 0 && num < 6).forEach(s -> System.out.println(s));

    }
}
