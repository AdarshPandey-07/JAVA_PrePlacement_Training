import java.util.Scanner;



public class B3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int i = sc.nextInt();
        int n = i;
        int rem = 0;
        double rev = 0;
        while (i!=0) {
            rem=i%10;
            rev=rev*10+rem;
            i=i/10;
        }

        if (n==rev)
            System.out.println("palindrome");
        else
            System.out.println("non palindrome");
            
        

    }

    
}