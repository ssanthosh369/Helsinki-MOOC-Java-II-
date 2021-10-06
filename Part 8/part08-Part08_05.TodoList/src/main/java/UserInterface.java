import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if(input.equals("stop")) {
                break;
            }

            if(input.equals("add")) {
                System.out.print("To add: ");
                input = scanner.nextLine();
                if(input.equals("stop")) {
                    break;
                }
                list.add(input);
            }

            if(input.equals("list")) {
                list.print();
            }

            if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                input = scanner.nextLine();
                if(input.equals("stop")) {
                    break;
                }
                list.remove(Integer.parseInt(input));
            }




        }
    }
}
