import java.util.Scanner;

public class Three {
    public static double balance = 0;

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an Option:\n\t1. Deposit\n\t2. Withdraw\n\t3. Balance\n\t4. Exit");
            String option = input.nextLine();
            option = option.toLowerCase();
            if (option.equals("exit") || option.equals("4")) {
                break;
            } else if (option.equals("deposit") || option.equals("1")) {
                System.out.print("input deposit amount: ");
                deposit(input.nextDouble());
                input.nextLine();
            } else if (option.equals("withdraw") || option.equals("2")) {
                System.out.print("input withdraw amount: ");
                withdraw(input.nextDouble());
                input.nextLine();
            } else if (option.equals("balance") || option.equals("3")) {
                System.out.println("your current balance is: " + balance +"\n");
            } else {
                System.out.println("input either the option serial number or the name properly\n");
            }
        }
    }


    public static void deposit(double amount) {
        balance += amount;
    }

    public static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("invalid withdraw. can't withdraw if amount is bigger than balance\nbalance: " + balance +"\n");
        } else {
            balance -= amount;
        }

    }

    public static void main(String[] args) {
        mainMenu();
    }


}
