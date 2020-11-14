import java.util.Scanner;

public class MathOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of one side for the hexagon");
        double s = input.nextDouble();
        double hexagonArea = ((6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)));
        System.out.println(String.format("%.2f", hexagonArea));
    }
}
