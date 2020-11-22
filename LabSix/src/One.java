import java.util.Scanner;

public class One {

    public static void arrayExample(int n) {
        int[] arr = new int[n];
        Scanner input = new Scanner(System.in);
        System.out.println("give some integer inputs for array size " + n);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("you have given these input ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void arrayExample(int m, int n) {
        int[][] arr = new int[m][n];
        Scanner input = new Scanner(System.in);
        System.out.println("give some integer inputs for array size " + m + " and " + n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("you have given these input ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void arrayExample(int m, int n, int o) {
        int[][][] arr = new int[m][n][o];
        Scanner input = new Scanner(System.in);
        System.out.println("give some integer inputs for array size " + m + ", " + n + " and ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    arr[i][j][k] = input.nextInt();
                }
            }
        }
        System.out.println("you have given these input ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    System.out.print(arr[i][j][k]+"\t");
                }
                System.out.println("");
            }
            System.out.println(i + "th channel");
        }
    }


    public static void main(String[] args) {
        arrayExample(3);
        arrayExample(2, 3);
        arrayExample(2, 3, 4);
    }
}
