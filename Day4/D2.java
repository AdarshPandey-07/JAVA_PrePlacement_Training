import java.util.*;
class triangle{
    double A= 4;
    double B= 5;
    double C= 6;
public void area(){
   
    double s= ((A+B+C)/2);
    double area = Math.sqrt((s*(s-A)*(s-B)*(s-C)));
    System.out.println("The area is"+area);
    
}

}
public class D2 {
    public static void main(String[] args) {
        triangle t = new triangle();
        t.area();
    }

    
    
}