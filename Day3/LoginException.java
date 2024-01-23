import java.util.Scanner;
    class UsernameException extends Exception{
        public UsernameException(){
                System.out.println("Username is invalid");
        }
    }

    class PasswordException extends Exception{
        public PasswordException(){
                System.out.println("Password is invalid");
        }
    }

public class LoginException {
    
    static void statusUsername(String name) throws UsernameException{
        if ("manas".equals(name))
            System.out.println("Plz enter your password");
        else
            throw new UsernameException();
    }
    static void statusPassword(String name) throws PasswordException{
        if ("123456".equals(name))
            System.out.println("Welcome");
        else
            throw new PasswordException();
    }
    public static void main(String[] args) throws UsernameException, PasswordException {
      
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        LoginException.statusUsername(b);   
        
        String a = sc.next();
        LoginException.statusPassword(a); 
    }   
}
