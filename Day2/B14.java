//Solution of Max marks in a sem


import java.util.Arrays;
import java.util.Scanner;

public class B14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of semesters: ");
        int sems= sc.nextInt();
        int subs[]=new int[sems];
        for(int i=1;i<=sems;i++){
            System.out.print("Enter number of subjects in semester "+i+" :");
            subs[i-1]=sc.nextInt();
        }

        
        int temp;
        int max = Arrays.stream(subs).max().getAsInt();
        int marks[][]= new int[sems][max];
        for (int j=0;j<sems;j++){
            for(int k=0;k<subs[j];k++){
                System.out.println("Enter marks obtained in sem "+(j+1)+" subject "+(k+1)+" :");
                temp = sc.nextInt();
                if (temp>=0 && temp<=100)
                    marks[j][k]=temp;
                else{
                    System.out.println("You have entered invalid marks!");
                    System.exit(0);
                }
            }
        }
               
        int max_marks=0;
        for (int m=0;m<sems;m++){
            for (int n=0;n<max;n++){
                if (marks[m][n]>max_marks)
                max_marks=marks[m][n];
            }
            System.out.println("Maximum marks in sem "+(m+1)+" is: "+max_marks);
        }
        sc.close();
    }
}