import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = input.nextInt();
        boolean y = false;
        for (int x = 2; x < number; x++) {
            if (number % x == 0) {
                y = true;
            }
        }
        if (y == true) {
            System.out.println("It's Not a Prime Number");
        } else {
            System.out.println("It's a Prime Number");
        }

    }
}
