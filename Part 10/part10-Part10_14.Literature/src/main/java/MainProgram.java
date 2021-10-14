
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list = new ArrayList<Book>();
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            
            if(name.isEmpty()) {
                System.out.println(list.size() + " books in total.");
                break;
            }

            System.out.print("Input the age recommendation: ");
            int age = scanner.nextInt();
            list.add(new Book(name,age));
            scanner.nextLine();
        }

        System.out.println("Books:");
        Comparator<Book> comparator = Comparator
                                        .comparing(Book::getAge)
                                        .thenComparing(Book::getName);

        Collections.sort(list, comparator);

        list.stream().forEach(s -> System.out.println(s));
    }

}
