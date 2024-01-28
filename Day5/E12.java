//program to use final variable
class FinalDemo{
    final int MAX=89;
    void me(){
        MAX=110;
    }

    }

public class E12 {
public static void main(String[] args) {
    FinalDemo obj = new FinalDemo();
    obj.me();
}  
}
/**PS C:\Users\Adarsh\Desktop\JAVA> javac E12.java
E12.java:5: error: cannot assign a value to final variable MAX
        MAX=110;
        ^
1 error */
