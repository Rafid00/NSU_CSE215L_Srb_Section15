import java.util.Scanner;

public class StringOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type Something: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            for (int j = -1; j < i; j++) {
                System.out.print(" ");
            }
        }
    }
}
