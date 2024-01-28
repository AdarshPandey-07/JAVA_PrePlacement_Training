/**Method overloading
 * 
 */
class Test{
   
    public void add(int a){
        System.out.println("a"+a);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}

public class E5 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.add(1);
        obj.add(22, 55);
        obj.add(24, 07, 010);
    }
    
}
