import java.util.Scanner;

class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int n = sc.nextInt();
        System.out.println("Enter column: ");
        int m = sc.nextInt();
        int i,j;
        
        for (i=1;i<=n;i++) {
            for (j=1;j<=m;j++){
                System.out.print(i);
            }
            System.out.println();
        }
       
    }    
}
