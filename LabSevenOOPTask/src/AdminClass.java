public class AdminClass {
    public String name;
    private String account_num;
    private double balance;

    public AdminClass() {
        this("User1", "1357913", 0);
    }

    public String getAccount_num() {
        return account_num;
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public AdminClass(String name, String account_num, double balance) {
        this.name = name;
        this.account_num = account_num;
        this.balance = balance;
    }

    public void deposit(int deposit_amount) {
        System.out.println("\n\nusername: " + this.name);
        System.out.println("account number: " + this.account_num);
        this.balance += deposit_amount;
        System.out.println("your balance is now: " + this.balance + "\n\n");
    }

    public void withdraw(int withdraw_amount) {
        System.out.println("\n\nusername: " + this.name);
        System.out.println("account number: " + this.account_num);
        if (withdraw_amount > this.balance) {
            System.out.println("withdraw not possible. As your balance is now: " + this.balance + "\n\n");
        } else {
            this.balance -= withdraw_amount;
            System.out.println("your balance is now: " + this.balance + "\n\n");
        }
    }

    public double checkBalance() {
        System.out.println("\nusername: " + this.name);
        System.out.println("account number: " + this.account_num);
        return this.balance;
    }

}
