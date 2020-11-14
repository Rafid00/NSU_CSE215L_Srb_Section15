import java.util.Scanner;

public class ExponentMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input the number: ");
        float num = input.nextFloat();

        System.out.println("e^(" + num + ") = " + Math.exp(num));
        System.out.println("log(" + num + ") = " + Math.log(num));
        System.out.println("log10(" + num + ") = " + Math.log10(num));
        System.out.println("sqrt(" + num + ") = " + Math.sqrt(num));
        System.out.print("input another number to define pow method: ");
        float num2 = input.nextFloat();
        System.out.println("(" + num + ") ^ (" + num2 + ") = " + Math.pow(num, num2));

    }
}
