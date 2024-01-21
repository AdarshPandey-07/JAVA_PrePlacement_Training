import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Write a amount");
                int d = sc.nextInt();
                
                System.out.println("Are you a student");
                String a = sc.next();
                
                double net;
                
                if("yes".equals(a))
                    if(d>=500)
                        net =d-((double)d)*(0.10);
                    else
                        net =d-((double)d)*(0.05);
                else
                    if(d>=500)
                        net =d-((double)d)*(0.08);
                    else
                        net =d-((double)d)*(0.02);
                System.out.println(net);
       
    }
}
