package self.created.exceptions;

public class OverEighteenException extends Exception{
    public OverEighteenException(){
        this("Age shouldn't be more than 18. Try Again");
    }
    public OverEighteenException(String message){
        super(message);
    }

}
