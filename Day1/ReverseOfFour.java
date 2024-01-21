import java.util.Scanner;
public class ReverseOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of A");
                int a = sc.nextInt();
                int n1= a%10;
                System.out.print(n1);
                a=a/10;
                int n2 = a%10;
                System.out.print(n2);
                int temp = a/10;
                int n3 = temp %10;
                System.out.print(n3);
                int n4 = temp/10;
                System.out.println(n4);
                
    }
}
