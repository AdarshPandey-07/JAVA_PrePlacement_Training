import java.util.*;
    public class C16{
        public static void main(String[] args){
            
            String str1 = "Listen";
            String str2 = "Sabcdt";
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if (str1.length() != str2.length()) {
                System.out.println("Anagram not possible");
            }
            char[] Array1= str1.toCharArray();
            char[] Array2= str2.toCharArray();
            Arrays.sort(Array1);
            Arrays.sort(Array2);
            if(Arrays.equals(Array1, Array2)){
                System.out.println("Anagram possible");
            }
            else{
                System.out.println("Anagram not possible");
            }




        }



    }

    