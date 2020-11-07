import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        int i = 0, num, sum = 0;
        System.out.println("enter an integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int arr[] = new int[num+1];

        for (i = 0; i <= num; i++) {
            arr[i] = i;
            sum += i;
//            if (i == num) {
//                System.out.print(i + " ");
//                break;
//            }
//            System.out.print(i + " +");
        }

        for (int j : arr) {
            if (arr[j] == num) {
                System.out.print(arr[j] + " ");
                break;
            }
            System.out.print(arr[j] + " + ");

        }
        System.out.println("= " + sum);
    }
}
