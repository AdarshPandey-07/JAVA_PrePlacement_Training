import java.util.Scanner;
public class A6{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;

        System.out.print("a"+a);
        System.out.print("b"+b);
       
        sc.close();
    }
}