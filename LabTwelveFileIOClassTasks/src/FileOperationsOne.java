import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperationsOne {
    public static void main(String[] args) {
        PrintWriter output = null;
        String filename = "test.txt";
        try {
            output = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception caught");
        }

        System.out.println("enter few strings");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String ln = sc.nextLine();
            output.println(i+ " th input "+ ln);
        }
        output.close();
        System.out.println("lines written successful");
    }
}
