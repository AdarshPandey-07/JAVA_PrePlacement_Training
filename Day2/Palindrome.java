import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;
        int sum=0;
        int temp =a;

        while(a!=0){
            sum=a%10;
            i=i*10+sum;
            a=a/10;
        }
        
        if(temp==i)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
 
    }
}
