/**method overriding
 * 
 */
class A{
    public int a =20;
    public void showA(){
        System.out.println("a "+a);
    }
}
class B extends A{
    public int a = 40;
    public void showB(){
        System.out.println("a" +a);
    }
}
public class E6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.showB();
    }
    
}
