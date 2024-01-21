import java.util.Scanner;
public class A9{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int hin = sc.nextInt();
        int min = 45;
        
        if (min<math)
            System.out.println("fail");
        else
            System.out.println("fpass");
        
        

        
        
       
        sc.close();
    }
}