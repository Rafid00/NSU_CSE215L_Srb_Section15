import java.util.Scanner;

//lab 6 task 4
//https://pastebin.ubuntu.com/p/KTjmCTn4pw/
public class Two {


    public static String[][] stringArrayExample(int m, int n) {
        String[][] arr = new String[m][n];
        Scanner input = new Scanner(System.in);
        System.out.println("give some integer inputs for array size " + m + " and " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextLine();
            }
        }
        System.out.println("\nyou have given these input");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        return arr;
    }

    public static void main(String[] args) {
        String str[][] = stringArrayExample(2, 2);
        System.out.println("\nhere the method returns");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(str[i][j] + " ");
            }
            System.out.println("");
        }
    }


}