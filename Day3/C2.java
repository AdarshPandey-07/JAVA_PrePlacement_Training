import java.util.*;


class InvalidAgeException1 extends Exception{
        public InvalidAgeException1 (String str){
            System.out.println(str);

        }

    }
    class UserException1 {
        static void status(int age) throws InvalidAgeException1
        {
            if (age>18){
                System.out.println("Elgible for marry");

            }
            else{
                throw new InvalidAgeException1("not able to marry, try again");

            }
        }
        public static void main(String[] args) throws InvalidAgeException1{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age");
            int age=sc.nextInt();
            UserException1.status(age);
            
        }
    
    }
    









