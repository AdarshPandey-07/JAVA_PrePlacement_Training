// final class
final class A{

}
class B extends A{
    void demo(){
        System.out.println("I am in A");
    }
}
public class E14 {
    public static void main(String[] args) {
        B obj = new B();
        obj.demo();
    }
    
}
/**E14.java:5: error: cannot inherit from final A
class B extends A{
                ^
1 error */
