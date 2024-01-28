class Test{
    void m1(int... n){
        System.out.println("Variable arguments"+n);
    }
    void m1(int n){
        System.out.println("normal arguments"+n);
    }
    
}
public class E8{
    public static void main(String[] args) {
        Test t = new Test();
       
        t.m1(10);
        
    }
}