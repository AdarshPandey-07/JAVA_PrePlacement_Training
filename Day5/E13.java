//final Method
class FinalMethod{
    final void Method(){
        System.out.println("Final method class Method");

    }
}
class ABC extends FinalMethod{
    void Method(){
        System.out.println("ABC Class method");
    }
}
    

public class E13 {
    public static void main(String[] args) {
        {
            ABC obj = new ABC();
            obj.Method();
        }
    }
    
}
/**E13.java:9: error: Method() in ABC cannot override Method() in FinalMethod
    void Method(){
         ^
  overridden method is final
1 error */