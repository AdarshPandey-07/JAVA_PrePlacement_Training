import java.util.Scanner;
    class UsernameException extends Exception{
        public UsernameException(){
                System.out.println("Username is invalid");
        }
    }

public class ExceptionHandling3 {
    
    static void status(String name) throws UsernameException{
        if ("manas".equals(name))
            System.out.println("Welcome");
        else
            throw new UsernameException();
    }
    public static void main(String[] args) throws UsernameException {
      
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        ExceptionHandling3.status(b);   
    }   
}
