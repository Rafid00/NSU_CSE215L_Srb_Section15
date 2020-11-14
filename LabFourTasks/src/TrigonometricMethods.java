import java.util.Scanner;

public class TrigonometricMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radian or Degree? Type R for Radian and D for Degree");
        char type = input.next().charAt(0);
        System.out.print("input the number: ");
        float num = input.nextFloat();
        if (type == 'R' || type == 'r') {
            System.out.println("sin(" + num + ") = " + Math.sin(num));
            System.out.println("cos(" + num + ") = " + Math.cos(num));
            System.out.println("tan(" + num + ") = " + Math.tan(num));

            System.out.println("sin^-1(" + Math.sin(num) + ") = " + Math.asin(Math.sin(num)) + " radians");
            System.out.println("cos^-1(" + Math.cos(num) + ") = " + Math.acos(Math.cos(num)) + " radians");
            System.out.println("tan^-1(" + Math.tan(num) + ") = " + Math.atan(Math.tan(num)) + " radians");
        } else if (type == 'D' || type == 'd') {
            System.out.println("sin(" + num + ") = " + Math.sin(Math.toRadians(num)));
            System.out.println("cos(" + num + ") = " + Math.cos(Math.toRadians(num)));
            System.out.println("tan(" + num + ") = " + Math.tan(Math.toRadians(num)));

            System.out.println("sin^-1(" + Math.sin(Math.toRadians(num)) + ") = " + Math.toDegrees(Math.asin(Math.sin(Math.toRadians(num)))) + " degree");
            System.out.println("cos^-1(" + Math.cos(Math.toRadians(num)) + ") = " + Math.toDegrees(Math.acos(Math.cos(Math.toRadians(num)))) + " degree");
            System.out.println("tan^-1(" + Math.tan(Math.toRadians(num)) + ") = " + Math.toDegrees(Math.atan(Math.tan(Math.toRadians(num)))) + " degree");
        }else{
            System.out.println("invalid!");
        }


    }
}
