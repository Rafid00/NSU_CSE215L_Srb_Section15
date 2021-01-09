package self.created.exceptions;

public class BooleanNotFoundException extends Exception{
    public BooleanNotFoundException() {
        this("only boolean value is accepted in this field. either true or false");
    }

    public BooleanNotFoundException(String message) {
        super(message);
    }
}
