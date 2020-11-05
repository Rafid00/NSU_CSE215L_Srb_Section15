import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integers: ");
        int num = input.nextInt();
        if (num >= 0) {
            System.out.println("your output is non-negative");
            if (num >= 1) {
                System.out.println("in addition, your output is a natural number");
            }
        } else {
            System.out.println("your output is a negative number");
        }
    }
}
