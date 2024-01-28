/**super variable at variable level */
class  Vehicle{
    int speed = 70;

}
class Car extends Vehicle{
    int speed= 130;
    void Display(){
        System.out.println("Maximum speed"+super.speed);
    }
}
public class E9 {
    public static void main(String[] args) {
        Car s=  new Car();
        s.Display();
    }
    
}
