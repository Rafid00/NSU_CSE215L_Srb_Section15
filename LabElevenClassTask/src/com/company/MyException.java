package src.com.company;
public class MyException extends Exception{
    double radius;
    public MyException(){ 
        super(); 
    }
    public MyException(String message)
    { super(message); 
    } 
    public void setRadius(double radius)
    throws MyException{ 
        if(radius<0){ 
            throw new MyException(" Invalid "+" radius "); 
        } 
        this.radius = radius; 
    }
    public static void main(String[] args)throws MyException{ 
        MyException c = new MyException();
    
    try { 
    c.setRadius(-5);
    } 
    catch(MyException e)
    { 
        System.out.println(e.getMessage()); 
    }
}
}

 