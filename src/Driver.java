import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberOrder numberOrder = new NumberOrder();
        System.out.println("------------------------------------------");
        System.out.println("|                Welcome!                 |");
        System.out.println("| Enter a number to check if it ascends. |");
        System.out.println("|   Enter * to go to the next feature.   |");
        System.out.println("------------------------------------------");
        System.out.print("Enter a number: ");
        String line = scan.nextLine();
        while(!line.equals("*")) {
            if(check(line)) {
                System.out.println(numberOrder.ascending(line));
                System.out.print("\nEnter a number: ");
            } else {
                System.out.print("Wrong input, try again: ");
            }
            line = scan.nextLine();
        }

        System.out.println("\n------------------------------------------");
        System.out.println("|  Enter a number to print out a square  |");
        System.out.println("|       based on the number given.       |");
        System.out.println("|         Enter * to go to exit.         |");
        System.out.println("------------------------------------------");
        System.out.print("Enter a number: ");
        line = scan.nextLine();
        while(!line.equals("*")) {
            if(check(line)) {
                System.out.println(numberOrder.squarePatch(Integer.parseInt(line)));
                System.out.print("\nEnter a number: ");
            } else {
                System.out.print("Wrong input, try again: ");
            }
            line = scan.nextLine();
        }
    }

    public static boolean check(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
