import java.util.*;
public class B13 {
   public static void main(String[] args) {
    int arr[]=new int[]{1,3,2,4};
    int arr1[] =new int[arr.length];
    
    for (int i=0;i<arr.length;i++){

        int max = arr[i];
        if (i== arr.length-1){
            arr1[i] = -1;
        }
        else{

        

        for(int j=i+1;j<arr.length;j++){
            if (arr[j] > max){
                max = arr[j];
                arr1[i] = max;
                break;

            }
            else{
                arr1[i] = -1;
            }
            
        }
    }

      
    }
    System.out.println(Arrays.toString(arr1));

   } 
}
