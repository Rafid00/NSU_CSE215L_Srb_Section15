import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadClass {
    public static void main(String[] args) {
        String filename = "test.txt";
        Scanner input = null;
        System.out.println("there file contains the following strings");

        try {
            input = new Scanner(new File(filename));

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        while (input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
    }
}
