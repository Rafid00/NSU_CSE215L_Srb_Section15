import java.util.Scanner;

public class RoundingMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a fractional number: ");
        float num = input.nextFloat();

        System.out.println("ceil of the number: " + Math.ceil(num));
        System.out.println("floor of the number: " + Math.floor(num));
        System.out.println("rint of the number: " + Math.rint(num));
        System.out.println("round of the number: " + Math.round(num));
    }
}
