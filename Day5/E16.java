import java.util.Scanner;

class BankAccount{
    int c_accno;
    int balance = 1000;
    String name, city;

    public void inputData(String name, String city){
        this.c_accno = 0;
        this.name = name;
        this.city = city;
        System.out.println("Inserted");
    }

    public void display() {
        System.out.println("+----------------------------------+");
        System.out.println("| Account No\tName\tBalance\tCity |%n");
        System.err.println("+----------------------------------+");
        System.out.println("|" + c_accno + "\t" + name + "\t" + balance + "\t" + city + "|");
        System.out.println("+----------------------------------+");
    }

    public void deposit(int amount){
        this.balance = balance + amount;
    }

    public void withdraw(int amount){
        this.balance = balance - amount;
    }
}

class SavingsAccount extends BankAccount{
    public void withdraw(int amount){
        if(balance - amount < 1000){
            System.out.println("Can't withdraw!!!");
        }else{
            balance = balance - amount;
        }
    }
}

public class E16 {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1 - Display");
            System.out.println("2 - InpuData");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Deposit");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch(c){
                case 1 : 
                    obj.display();
                    break;
                case 2 :
                    System.out.println("Enter name & city");
                    String name = sc.nextLine();
                    String city = sc.nextLine();
                    obj.inputData(name, city);
                    break;
                case 3:
                    System.out.println("Enter withdraw amount");
                    int amount = sc.nextInt();
                    obj.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Enter deposit amount");
                    int amounts = sc.nextInt();
                    obj.deposit(amounts);
                    break;
                default:
                    System.out.println("Not valid!!!");
                    break;
            }

        }
    }
}