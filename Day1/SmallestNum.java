import java.util.Scanner;
public class SmallestNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of A");
                int a = sc.nextInt();
                System.out.println("Enter Value of B");
                int b = sc.nextInt();
                System.out.println("Enter Value of C");
                int c = sc.nextInt();
                System.out.println("Enter Value of D");
                int d = sc.nextInt();
                System.out.println("Enter Value of E");
                int e = sc.nextInt();
                
                int min = a;
                
                if (min > b)
                    min = b;
                if (min > c)
                    min = c;
                if (min > d)
                    min = d;
                if (min > e)
                    min = e;
                
                System.out.println(min);            
    }
}
