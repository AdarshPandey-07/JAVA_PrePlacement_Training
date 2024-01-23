//user define exception, throw keyword
import java.util.*;
class ExceptionDemo2{
    static void checkage(int age)
    {
        if (age>18)
        {
            System.out.println("eligible");
        }
        else {
            throw new ArithmeticException("not elgible");

        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        int a = sc.nextInt();
        ExceptionDemo2.checkage(a);
    }
}
