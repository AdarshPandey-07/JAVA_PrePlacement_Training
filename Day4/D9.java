public class D9 {
    public void show(){
        System.out.println("Non static show");
    }
    
}
{
    show();
}
static{
    System.out.println("I am in Static block");
}
public static void main(String [] args){
    D9 s=new D9();
    System.out.println("I am in main");
}

