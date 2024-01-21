import java.util.Scanner;
public class A13{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int hin = sc.nextInt();
        int eng = sc.nextInt();
        
        
        double sum = math+sci+hin;
        double percent = sum*100/400;

        
        if (percent >=90){
        System.out.println("Grade A");
        else if (percent >=80)
        System.out.println("Grade B");
        else if (percent >=70)
        System.out.println("Grade C");
        else if (percent >=60)
        System.out.println("Grade D");
        else 
        System.out.println("Fail");

        
            
        
        
        

        
        
       
        sc.close();
    }
}