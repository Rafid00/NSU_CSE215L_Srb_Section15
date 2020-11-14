import java.util.Scanner;

public class IndexString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input main String: ");
        String str1 = input.nextLine();
        System.out.println("input a character: ");
        char ch= input.next().charAt(0);

        System.out.println("first occurance of the character in index: "+ str1.indexOf(ch, 0));
        System.out.println("last occurance of the character in index: "+ str1.lastIndexOf(ch, str1.length()-1));
        input.nextLine();

        System.out.println("input second line: ");
        String str2 = input.nextLine();

        System.out.println("first occurance of the string in index: "+ str1.indexOf(str2,0));
        System.out.println("last occurance of the string in index: "+ str1.lastIndexOf(str2,str1.length()-1));
    }
}
