import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Your BMI here: ");
        double bmi = input.nextDouble();
        if (18.5 > bmi) {
            System.out.println("you're \"underweight\"");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("you're \"healthy\"");
        } else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("you're \"overweight\"");
        } else if (30 <= bmi && bmi <= 39.9) {
            System.out.println("you're \"obese\"");
        }
    }
}
