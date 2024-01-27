import java.util.*;
class rectangle{
    double a = 4;
    double b = 5;
    double c = 5;
    double d = 8;
    
    public void area(){
        double area1 = (2*(a*b));
        double area2 = (2*(b*d));
        System.out.println("the area is "+area1+" "+area2);

    }
}
public class D3{
public static void main(String[] args) {
    rectangle r = new rectangle();
    r.area();
}
}

