import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        
        
            if(i%2==0){
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            sc.close();          
            }
}
    
   
    
