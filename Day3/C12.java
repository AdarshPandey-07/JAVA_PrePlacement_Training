import java.util.Scanner;

public class C12 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sring");
        String s = sc.nextLine();
        String rev = "";

        for (int  i = 0; i= s.length(0,6)-i-1; ++i){
            rev = s.charAt(i);
            System.out.println(rev);


        }

    }
    
    
}
