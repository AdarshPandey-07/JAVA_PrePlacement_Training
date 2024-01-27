class NewClass{
    public int area(int x, int y){
        return x*y;
    }
}

public class ParaFun {
  
    public static void main(String[] args) {
        NewClass obj = new NewClass(); 
        System.out.println(obj.area(4, 5));
        System.out.println(obj.area(5, 8));

    }    
} 
