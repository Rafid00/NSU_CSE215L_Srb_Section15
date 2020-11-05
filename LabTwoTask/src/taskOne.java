import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an Integer: ");
        int num = input.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("you typed an Even Number");
                break;
            default:
                System.out.println("you typed an Odd Number");
        }
    }
}
