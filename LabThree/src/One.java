import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int i = 0, num, sum = 0;
        System.out.println("enter an integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();


//              while-->
//        while (i <= num) {
//            sum += i;
//            if (i == num) {
//                System.out.print(i + " ");
//                break;
//            }
//            System.out.print(i + " +");
//
//            i++;
//        }


//              do-while-->

//        do {
//            sum += i;
//            if (i == num) {
//                System.out.print(i + " ");
//                break;
//            }
//            System.out.print(i + " +");
//            i++;
//        } while (i <= num);

//             for-->
        for (i = 0; i <= num; i++) {
            sum += i;
            if (i == num) {
                System.out.print(i + " ");
                break;
            }
            System.out.print(i + " +");
        }

        System.out.println(" = " + sum);
    }
}
