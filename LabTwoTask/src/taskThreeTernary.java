import java.util.Scanner;

public class taskThreeTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float bmi = input.nextFloat();
        String msg = (bmi < 18.5) ? "\"underweight\"" :
                ((18.5 <= bmi && bmi <= 24.9) ? "\"healthy\"" :
                        (25 <= bmi && bmi <= 29.9) ? "\"overweight\"" :
                                (30 <= bmi && bmi <= 39.9) ? "\"obese\"" : " ");
        System.out.print("you're " + msg);
    }
}
