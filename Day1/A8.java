import java.util.Scanner;
public class A6{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int max = a;
        if (max>b){
            max=b;
        }
        if (max>c){
            max=c;
        }
        if (max>d){
            max=d;
        }
        if (max>e){
            max=e;
        }

       
       
       
       

        System.out.print("greatest number is"+max);
        
       
        sc.close();
    }
}