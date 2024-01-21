import java.util.Scanner;
public class A10{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int hin = sc.nextInt();
        
        System.out.println("Enter your gender M/F");
        char sex = sc.next().charAt(0);
        double sum = math+sci+hin;
        double percent = sum*100/300;

        
        if (percent >=62 || sex == 'F' )
            System.out.println("pass");
        else
            System.out.println("fail");
        
        

        
        
       
        sc.close();
    }
}