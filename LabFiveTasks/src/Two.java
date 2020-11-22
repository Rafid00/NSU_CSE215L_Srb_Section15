import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a string: ");
        String str = input.nextLine();

        boolean result = isPalindrome(str);

        if (result) {
            System.out.println("Yes, It's Palindrome");
        } else {
            System.out.println("No, It's not Palindrome");
        }
    }


    public static boolean isPalindrome(String str) {
        String str1 = str;
        for (int i = 0; i < str.length(); i++) {
            if (str1.charAt(str.length() - (i+1)) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
