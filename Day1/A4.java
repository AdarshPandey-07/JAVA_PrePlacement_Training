import java.util.Scanner;
public class A4{
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
        int sum = n1 + n2 + n3;
        System.out.println("number"+sum);
        sc.close();
    }
}
    