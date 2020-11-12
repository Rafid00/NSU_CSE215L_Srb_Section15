import java.util.Scanner;

public class cgpaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input the total number of courses done: ");
        int n = input.nextInt();
        float[] finalMarks = new float[n];
        float[] grade = new float[n];
        float[] creditHour = new float[n];
        float totalCreditHour = 0, totalGPCH = 0;
        for (int x = 0; x < n; x++) {
            System.out.print("input the final marks of course " + (x + 1) + ": ");
            float val1 = input.nextFloat();
            System.out.print("input the credit hours of course " + (x + 1) + ": ");
            float val2 = input.nextFloat();

            //entering final marks into array

            finalMarks[x] = val1;

            totalCreditHour += val2;

            //entering credit hours into array

            creditHour[x] = val2;

        }

        for (int x = 0; x < n; x++) {
            if (finalMarks[x] >= 93) {
                grade[x] = 4f;
            } else if (finalMarks[x] >= 90 && finalMarks[x] <= 92) {
                grade[x] = 3.7f;
            } else if (finalMarks[x] >= 87 && finalMarks[x] <= 89) {
                grade[x] = 3.3f;
            } else if (finalMarks[x] >= 83 && finalMarks[x] <= 86) {
                grade[x] = 3f;
            } else if (finalMarks[x] >= 80 && finalMarks[x] <= 82) {
                grade[x] = 2.7f;
            } else if (finalMarks[x] >= 77 && finalMarks[x] <= 79) {
                grade[x] = 2.3f;
            } else if (finalMarks[x] >= 73 && finalMarks[x] <= 76) {
                grade[x] = 2f;
            } else if (finalMarks[x] >= 70 && finalMarks[x] <= 72) {
                grade[x] = 1.7f;
            } else if (finalMarks[x] >= 67 && finalMarks[x] <= 69) {
                grade[x] = 1.3f;
            } else if (finalMarks[x] >= 60 && finalMarks[x] <= 66) {
                grade[x] = 1f;
            } else if (finalMarks[x] < 60) {
                grade[x] = 0f;
            }
        }

//        calculation part

        for (int x = 0; x < n; x++) {
            totalGPCH += (grade[x] * creditHour[x]);
        }

        float result = totalGPCH / totalCreditHour;

        System.out.println("\nyour CGPA: " + result);

    }
}
