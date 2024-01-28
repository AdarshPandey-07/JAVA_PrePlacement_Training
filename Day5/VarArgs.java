class B{
    void addNum(int a){ //Priority 
        System.out.println(a);
    }
    void addNum(int... x){
        for(int a:x){
        System.out.print(a+" ");}
        System.out.println();
    }
}
public class VarArgs {
         
    public static void main(String[] args) {
        B obj = new B();
        obj.addNum(10);
        obj.addNum(10,20);
        obj.addNum(10,20,30);
    }      
}
