import java.util.Scanner;
public class LargestNum {
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
                
                int max = a;
                
                if (max < b)
                    max = b;
                if (max < c)
                    max = c;
                if (max < d)
                    max = d;
                if (max < e)
                    max = e;
                
                System.out.println(max);
                
               
                
                
    }
}
