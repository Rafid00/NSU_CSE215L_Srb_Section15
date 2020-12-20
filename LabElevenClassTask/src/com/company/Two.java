package src.com.company;
public class Two {
    
    public static void printLength(String s) throws NullPointerException
    { 
        if(s==null)
        { 
            throw new NullPointerException("Null" + " string");
        } 
        System.out.println(s.length()); 
    }
    public static void main(String[] args) { 
        try{ 
            String str = null; printLength(str);
        } 
        catch(NullPointerException e)
        { 
            System.out.println(e.getMessage()); 
        } 
    }
}