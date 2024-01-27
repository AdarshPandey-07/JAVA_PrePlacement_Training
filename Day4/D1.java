import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    int rollno[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mob[] = new String[10];
    int i = 0;
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.");
        rollno[i] = sc.nextInt();
        ++i;
        System.out.println("Enter name.");
        
        name[i] = sc.next();
        ++i;
        System.out.println("Enter city.");
        city[i] = sc.next();
        ++i;
        System.out.println("Enter mobile number");
        mob[i] = sc.next();
        ++i;


    }
    public void showInfo(){
        System.out.println("Rollno\tName\tCity");
        System.out.println("------------------");
        for (i=1;i<=rollno.length;++i){
            System.out.println(rollno[i]+"\t"+name[i]+"\t"+city[i]);
        }


    }
    public void deleteData(){
        int k;

        for (k=i;i<=rollno.length;++i){
            name[k]=name[k+1];
            city[k]=city[k+1];
            mob[k]=mob[k+1];
            
        }

    }
    public void updateData(){
        System.out.println("enter roll no.");
        int rollnum = sc.nextInt();
        for (i=0;i<rollno.length;++i){
            if (rollnum==rollno[i]){
                System.out.println("Roll no." +rollno[i]);
                System.out.println("1. name." +name[i]);
                System.out.println("2. City" +city[i]);
                System.out.println("3. mobile number" +mob[i]);
                System.out.println("select choice to update");
                int n  = sc.nextInt();
                switch (n) {
                    case 1: System.out.println("enter new name ");
                            String sname = sc.next();
                            name[i] = sname;
                            System.out.println("Data updated");
                        
                        break;
                    case 2: System.out.println("enter new city ");
                            String scity = sc.next();
                            city[i] = scity;
                            System.out.println("Data updated");
                    
                
                    

                        break;
                    case 3: System.out.println("enter new city ");
                            String smob = sc.next();
                            mob[i] = smob;
                            System.out.println("Data updated");
                        break;
                    default: System.out.println("No data Updated");
                        break;
                
                }
        

            }

        }

    }



    
}
class MyJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student st = new Student();
        while (true){
            System.out.println("1. input data");
            System.out.println("2. show info data");
            System.out.println("3. delete data");
            System.out.println("4. update data");
            System.out.println("5. exit");
            System.out.println("Enter any choice");
            int a =sc.nextInt();
            switch (a) {
                case 1: st.inputData();
                    
                    break;
                case 2: st.showInfo();
                    
                    break;
                case 3: st.deleteData();
                    break;
                case 4: st.updateData();
                    break;
                case 5: System.exit(0);
            
                default: System.out.println("Enter a valid choice");
                            int b =sc.nextInt(0);
                            b=a;
                    break;
            }


        }

        
    
    
}
}
