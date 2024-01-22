import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        int i;
        int f1=0;
        int f2=1;
        int f3 = 0;
        
        System.out.print(f1);
        System.out.print(" "+f2);
        
        for(i=3;i<=n;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            
        }
        System.out.println();
    }
    
}
