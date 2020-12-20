package src.com.company;
public class One {
    public static void main(String[ ] args) {
    try { 
    int[ ] array = new int[5]; 
    array[7] = 20; } 
    catch(ArrayIndexOutOfBoundsException e){
    System.err.println("Out of range"); }
} 
}
