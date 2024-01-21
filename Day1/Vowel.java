import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
                System.out.println("Type a letter");
                String d = sc.next();
                
                if("a".equals(d) || "e".equals(d) || "i".equals(d) || "o".equals(d) || "u".equals(d) )
                    System.out.println("Vowel");
                else
                    System.out.println("Consonant");
               
           
    }
}
