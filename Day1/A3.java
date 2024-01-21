import java.util.Scanner;
public class A3{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new number");
        int a = sc.nextInt();
        int b = a % 10;
        int c = a / 10;
        int sum = b + c;
        System.out.println("number"+sum);
        sc.close();
    }
}
    
