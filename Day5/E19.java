

public class E19 {
    public static void main(String[] args) {
        String abc = "aabbcccdddd";
        int count =0;
        int i;
        int j;
        
        
        for( i = 0;i<abc.length();i++){
            
            for (j = 0;j<abc.length();j++){
                if(abc.charAt(i)==abc.charAt(j)){
                    count++;
                    
                    
                }
                else{
                    System.out.print(abc.charAt(i)+""+count);
                    
                    
                    break;
                }
                
                }
                
                

            }
            i=j;
            
           

        }
    }
    

