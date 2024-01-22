import java.util.Scanner;



public class B2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int i = sc.nextInt();
        int n = i;
        int rem = 0;
        double sum = 0;
        while (i>0) {
            rem=i%10;
            sum=sum+(rem*rem*rem);
            i=i/10;
        }

        if (n==sum)
            System.out.println("arnstrong");
        else
            System.out.println("not arnstrong");
            
        

    }

    
}