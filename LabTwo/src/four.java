import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num= input.nextInt();

        switch (num)
        {
            case 1:
                System.out.println("you have entered 1");
                break;
            case 2:
                System.out.println("you have entered 2");
                break;
            case -1:
                System.out.println("you have entered -1");
        }
    }
}
