package self.created.exceptions;

public class NonNumericNotAllowedException extends Exception{
    public NonNumericNotAllowedException() {
        this("Non Numeric values are not allowed, try again");
    }

    public NonNumericNotAllowedException(String message) {
        super(message);
    }
}
