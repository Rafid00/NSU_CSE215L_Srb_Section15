import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0;
        float average, percentage;
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("input value " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            sum += array[i];
        }
        average = (float) sum / 6;
        System.out.println("average: " + average);
        for (int i = 0; i < 6; i++) {
            if (array[i] > average) {
                count++;
            }
        }
        percentage = (((float)count * 100) / 6);
        System.out.println("percentage is: " + percentage);
    }
}
