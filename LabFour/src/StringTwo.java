import java.util.Scanner;

public class StringTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = input.nextLine();

        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 < n2) {
            System.out.println("the second string be smaller in length");
        }
        if (str1.substring(0, n2).equals(str2)) {
            System.out.println("String " + str1 + " starts with String " + str2);
        }
        else {
            if (str1.substring(n1 - n2, n1).equals(str2)) {
                System.out.println("String " + str1 + " ends with String " + str2);
            } else {
                System.out.println("String " + str1 + " has no match with " + str2);
            }

        }

    }
}




