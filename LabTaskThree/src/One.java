import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("enter your name: ");
        String name = input.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println(name);
        }

    }
}
