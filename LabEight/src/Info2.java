public class Info2 {
    public static void main(String[] args) {
        Info1 obj1=new Info1(15,30);
        obj1.add(obj1);
        Info1 obj2=new Info1(5,30);
        obj2.displayRaw();
        obj2.add(obj1);

        System.out.println(obj1);
    }
}
