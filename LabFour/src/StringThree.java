import java.util.Scanner;

public class StringThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str1 = input.nextLine();
        int currVow = 0, prevVow = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                prevVow = currVow;
                currVow = i;
            }
        }
        System.out.println("Second Last occurance of vowel is at " + prevVow + "");
    }

}
