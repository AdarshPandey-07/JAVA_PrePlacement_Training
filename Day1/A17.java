import java.util.Scanner;

public class 17 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter char");
        char n = sc.next().charAt(0);
        
        switch (n){
            case ('a'):
                System.out.println("Vowel");
                break;
            case ('e'):
                System.out.println("Vowel");
                break;
            case ('i'):
                System.out.println("Vowel");
                break;
            case ('o'):
                System.out.println("Vowel");
                break;
            case ('u'):
                System.out.println("Vowel");
                break;    
            default:
                System.out.println("Consonant");
                break;
        }
        
       
    }
}