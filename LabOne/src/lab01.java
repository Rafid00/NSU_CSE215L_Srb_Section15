import java.util.Scanner;

public class lab01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int userGivenInteger = input.nextInt();
        input.nextLine();

        System.out.println(userGivenInteger);
        System.out.println("Enter any string: ");
        String userGivenString = input.nextLine();
        System.out.println(userGivenString);

        input.close();
    }
}