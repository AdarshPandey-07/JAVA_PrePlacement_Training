
import java.util.Scanner;



public class B1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int i = sc.nextInt();
        int n = 0;
        while (i!=0) {
            i=i/10;
            n++;
            
        }
        System.out.println(n);

    }

    
}
//to do sum/mul/fact