import java.util.Scanner;
public class A5{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int a = sc.nextInt();
        int n1 = a % 10;
        a = a / 10;
        int n2 = a % 10;
        a = a / 10;
        int n3 = a % 10;
        a = a / 10;
        int n4 = a % 10;
        System.out.print(""+n1);
        System.out.print(""+n2);
        System.out.print(""+n3);
        System.out.print(""+n4);
        sc.close();
    }
}