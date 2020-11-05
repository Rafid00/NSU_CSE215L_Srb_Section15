import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("You Have Entered 0");
        } else
            System.out.println("You Have Entered a Non-Zero Number");
    }
}