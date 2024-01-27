public class StaticVariable {
    
    static{
        System.out.println("I am in static block");
    }
    
    static int n=5;
    public static void main(String[] args) {
        System.out.println(n);
        System.out.println("I am in main");
    }    
}
