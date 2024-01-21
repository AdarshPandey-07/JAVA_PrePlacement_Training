import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("What DAY it is?");
                String d = sc.next();
                
                if("sun".equals(d) || "sat".equals(d) || "fri".equals(d) )
                    System.out.println("Weekend");
                else
                    System.out.println("Weekday");
               
           
    }
}
