import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 1, extra;
        System.out.print("enter a number: ");
        int num = input.nextInt();
        System.out.print("first " + num + " fibonacci numbers: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(x + " ");
            extra = y;
            y += x;
            x = extra;
        }
    }
}
