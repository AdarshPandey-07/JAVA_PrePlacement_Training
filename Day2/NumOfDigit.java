import java.util.Scanner;
public class NumOfDigit {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;

        while(a!=0){
            a=a/10;
            i++;
        }
        
        System.out.println(i);
  
    }
}
