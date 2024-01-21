import java.util.Scanner;
public class A16{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("are you a student Y/N");
        char student = sc.next().charAt(0);
        double np;
        double dis;

        if ( student == 'Y' && CP >500){
            dis= CP*0.1;
            np= CP-dis;
            System.out.println("netprice is" +np);


        }
        else{
            dis = CP*0.05;
            np = CP-dis;
            System.out.println("netprice is" +np);
        }
        
        
        
        
        
        sc.close();
    }
}