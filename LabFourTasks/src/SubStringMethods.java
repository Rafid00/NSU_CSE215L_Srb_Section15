import java.util.Scanner;

public class SubStringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first line: ");
        String str1 = input.nextLine();
        System.out.println("input second line: ");
        String str2 = input.nextLine();

        if(str1.substring(0, str2.length()).equalsIgnoreCase(str2)){
            System.out.println(str1 + " starts with " + str2);
        }else{
            System.out.println(str1 + " doesn't starts with " + str2);
        }
    }
}
