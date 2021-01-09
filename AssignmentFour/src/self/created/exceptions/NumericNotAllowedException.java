package self.created.exceptions;

public class NumericNotAllowedException extends Exception{
    public NumericNotAllowedException(){
        this("numeric values are not allowed in this field. Try again");
    }

    public NumericNotAllowedException(String message){
        super(message);
    }
}
