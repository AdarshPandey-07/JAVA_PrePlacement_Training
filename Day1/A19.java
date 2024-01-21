import java.util.Scanner;

public class 19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("What year is it?");
                int d = sc.nextInt();
                
                if(d%100!=0)
                    if(d%4==0)
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not Leap Year");
                else
                    if(d%400==0)
                        System.out.println("Century Leap Year");
                    else
                        System.out.println("Not Century Leap Year");
                        
                        
                
               
           
    }
}
