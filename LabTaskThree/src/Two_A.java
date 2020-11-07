import java.util.Scanner;

public class Two_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input an Integer: ");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for(int k = 0; k<=(n-i); k++)
            {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}