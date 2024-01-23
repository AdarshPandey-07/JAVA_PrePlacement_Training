import java.util.Scanner;
public class ExceptionHandling1 {

    class DemoException{
        static void checkAge(int age){
            if(age>17)
                System.out.println("Can marry");
            else
                throw new ArithmeticException("Cannot marry");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        DemoException.checkAge(b);
        sc.close();
        
    }
    
}
