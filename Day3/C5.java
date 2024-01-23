import java.util.*;
class InvalidUsernamePasswordException extends Exception
{
    public InvalidUsernamePasswordException(String str){
        System.out.println(str);
    }
}
class UserException1 {
    static void status (char username) throws InvalidUsernamePasswordException
    {
        if( username== "a")
        {
            System.out.println("Access granted");

        
        }
        else {
            throw new InvalidUsernamePasswordException("wrong username or password");

        }
class UserException2 {
    static void status (int username,int password) throws InvalidUsernamePasswordException
    {
        if( username == 1 && password==123 )
        {
            System.out.println("Access granted");

        
        }
        else {
            throw new InvalidUsernamePasswordException("wrong username or password");

        }

        public static void main (String[]args) throws InvalidUsernamePasswordException{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter user and ");
            int username =sc.nextInt();
            int password = sc.nextInt();
            UserException.status(username && password);
        }


        
        
        
    }
}

