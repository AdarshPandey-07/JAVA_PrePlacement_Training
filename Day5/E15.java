import java.util.Scanner;

class Employee{
    static int eno;
    static    String ename;
     static   int esal;
     static   String city;
    public Employee(){
        
        

        }
    public void  work(){
        System.out.println("Completing The project");

    }
    public static void getSalary(){
        System.out.println("enter eno");
        
        for (eno=0 ;eno<10;eno++){
            System.out.println("The salary of "+ename +"is"+esal);

        }

    }

    public  void addEmployee(){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter eno");
        eno = sc.nextInt();
        System.out.println("enter ename");
        ename = sc.next();
        System.out.println("enter eno");
        esal = sc.nextInt();
        System.out.println("enter eno");
        city = sc.next();
        sc.close();


    }
}

class HRManager extends Employee{
    public HRManager(){
        super.work();
        public showEmployee(){

        }  
        
        

    }
}
public class E15 {
    public static void main(String[] args) {
        HRManager obj = new HRManager();
    }
    
    
}
