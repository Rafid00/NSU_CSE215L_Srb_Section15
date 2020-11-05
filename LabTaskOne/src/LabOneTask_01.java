import java.util.Scanner;

public class LabOneTask_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        byte age = input.nextByte();
        input.nextLine();

        System.out.print("Enter Department: ");
        String department = input.nextLine();

        System.out.println("\nName: " + name + "\nAge: " + age + "\nDepartment: " + department);
    }
}
