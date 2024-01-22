import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        int arr[]= {1,3,2,4};
        int res[]= new int[4];
        
        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        for(int i = 0; i<arr.length ; i++){
            if(i==arr.length-1){
                res[i]=-1;
            }
            else
                
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;}
                else
                    res[i]=-1;
                    //if(j==arr.length)
                      //  System.out.print("-1");
                
        }
        
        }
        
        for(int i = 0; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
    
}
