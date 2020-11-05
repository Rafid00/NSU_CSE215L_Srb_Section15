import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char ch = input.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("you have entered a");
                break;
            case 'b':
                System.out.println("you have entered b");
                break;
            case 'c':
                System.out.println("you have entered c");
                break;
            default:
                System.out.println("you have entered any other charecter rather than a, b, c");
        }
    }
}
