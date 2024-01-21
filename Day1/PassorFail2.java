import java.util.Scanner;
public class PassorFail2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter Value of First Paper");
                int a = sc.nextInt();
                System.out.println("Enter Value of Second Paper");
                int b = sc.nextInt();
                System.out.println("Enter Value of Third Paper");
                int c = sc.nextInt();
                
                System.out.println("Enter Your Gender");
                String d = sc.next();
                
  
                double per= ((double)(a+b+c)/300)*100;
                if ("f".equals(d) && per > 62)
                    System.out.println("Pass");
                else
                    System.out.println("FAIL");
    }
}
