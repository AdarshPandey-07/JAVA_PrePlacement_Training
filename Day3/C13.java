//edit distance
import java.util.*;
class C13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        System.out.println("enter a string");
        String t = sc.nextLine();
        int S = s.length();
        int T = t.length();
        if (S>T){
            System.out.println(S-T);
        }
        else if (S<T){
            System.out.println(T-S);

        }
        else if (S==T){
            System.out.println(0);
        }
    

        
    }
}
