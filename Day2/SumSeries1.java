import java.util.Scanner;

public class SumSeries1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        double a = sc.nextDouble();
        
        System.out.println("Enter n");
        double n = sc.nextDouble();
        
        double i;
        double sum=1;
        
        for(i=1;i<=n;i++){
            
           sum=(((double) Math.pow(a,i))/i)+sum;
           
            
        }
        System.out.println(sum);
    }
    
}
