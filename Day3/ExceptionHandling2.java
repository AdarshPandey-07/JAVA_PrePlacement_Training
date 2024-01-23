import java.util.Scanner;
    class DemoException extends Exception{
        public DemoException(){
                System.out.println("Cannot marry");
        }
    }
public class ExceptionHandling2 {
    
    static void status(int age) throws DemoException{
        if (age >18)
            System.out.println("Can Marry");
        else
            throw new DemoException();
    }
    public static void main(String[] args) throws DemoException {
        
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        ExceptionHandling2.status(b);   
    }   
}
