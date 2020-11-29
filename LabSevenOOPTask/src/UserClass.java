import java.util.Scanner;

public class UserClass {
    public static void main(String[] args) {
        AdminClass user_one = new AdminClass();
        Scanner in = new Scanner(System.in);

        System.out.print("Username: ");
        user_one.name = in.nextLine();
        System.out.print("Account No.: ");
        user_one.setAccount_num(in.nextLine());


        while (true) {
            System.out.println("Choose an Option:\n\t1. Deposit\n\t2. Withdraw\n\t3. Balance\n\t4. Exit");
            String option = in.nextLine();
            option = option.toLowerCase();
            if (option.equals("exit") || option.equals("4")) {
                break;
            } else if (option.equals("deposit") || option.equals("1")) {
                System.out.print("input deposit amount: ");
                int amount = in.nextInt();
                in.nextLine();
                user_one.deposit(amount);
            } else if (option.equals("withdraw") || option.equals("2")) {
                System.out.print("input withdraw amount: ");
                int amount = in.nextInt();
                in.nextLine();
                user_one.withdraw(amount);
            } else if (option.equals("balance") || option.equals("3")) {
                System.out.println("your current balance is: " + user_one.checkBalance() + "\n");
            } else {
                System.out.println("input either the option serial number or the name properly\n");
            }
        }
    }
}
