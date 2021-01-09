package self.created.exceptions;

public class ExpenseLimitException extends Exception{
    public ExpenseLimitException() {
        this("expense should not be 25% more than the family income, Try Again");
    }

    public ExpenseLimitException(String message) {
        super(message);
    }
}
