import java.util.Scanner;

public class ErrorHandling {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try{
            int a=5;
            int b= sc.nextInt();
            int res = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("No Termination");
    }
    
}
