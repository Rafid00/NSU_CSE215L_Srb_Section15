import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first line: ");
        String str1 = input.nextLine();
        System.out.println("input second line: ");
        String str2 = input.nextLine();

        if (str1.equals(str2)) {
            System.out.println("both strings are equal");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("strings are equal when ignoring case");
        } else {
            System.out.println("strings are not equal");
        }

        if (str1.contains(str2)) {
            if (str1.startsWith(str2)) {
                System.out.println("\"" + str1 + "\" starts with \"" + str2 + "\"");
            } else if (str1.endsWith(str2)) {
                System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"");
            } else {
                System.out.println("\"" + str1 + "\" contains \"" + str2 + "\" somewhere in the middle");
            }
        } else {
            System.out.println("\"" + str1 + "\" doesn't contain \"" + str2 + "\"");
        }
    }
}
