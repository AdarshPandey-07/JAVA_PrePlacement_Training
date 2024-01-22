import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int i =0;
        int sum=0;
        int temp =a;

        while(a!=0){
            sum =((int) Math.pow((a%10),3))+sum;
            a=a/10;
            i++;
        }
        
        if(temp==(int)sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
 
    }
}

