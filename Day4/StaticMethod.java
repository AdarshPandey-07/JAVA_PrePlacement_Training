public class StaticMethod {
    
    static int i=5;
    static public void show(){
        System.out.println(i);
        i++;
    }
    
    static{
        show();
    }
    public static void main(String[] args) {
        System.out.println(i);
        System.out.println("I am in main");
    }    
}
