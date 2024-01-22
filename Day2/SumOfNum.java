import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;
        int sum=0;

        while(a!=0){
            sum =(a%10)+sum;  
            a=a/10;
            i++;
        }
        System.out.println(sum);
        
        System.out.println(i);
 
    }
}
