import java.util.Scanner;
public class ArmAny {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        
        int b =0;
        int sum=0;
        int temp =a;
        int temp1 =a;
        
        while(temp1!=0){
            temp1=temp1/10;
            b++;
        }
        
        System.out.println(b);

        while(a!=0){
            sum =((int) Math.pow((a%10),b))+sum;
            a=a/10;
           
        }
        
        if(temp==(int)sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
 
    }
}
