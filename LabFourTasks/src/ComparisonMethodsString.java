import java.util.Scanner;

public class ComparisonMethodsString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first line: ");
        String str1 = input.nextLine();
        System.out.println("input second line: ");
        String str2 = input.nextLine();

        if (str1.equals(str2)) {
            System.out.println("both are equal");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("equal when ignoring case");
        } else {
            System.out.println("not equal");
        }

        System.out.print("comparison of two strings: " +
                str1.compareTo(str2)+ "\n");
        System.out.print("comparison of two strings when ignoring case: " +
                str1.compareToIgnoreCase(str2)+ "\n");

        if (str1.contains(str2)) {
            if (str1.startsWith(str2)) {
                System.out.println(str1 + " starts with " + str2);
            } else if (str1.endsWith(str2)) {
                System.out.println(str1 + " ends with " + str2);
            } else {
                System.out.println(str1 + " contains \"" + str2 + "\" somewhere in the middle");
            }
        }


    }

}
