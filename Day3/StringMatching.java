public class StringMatching {
    
    public static void main(String[] args) {
       
        String a = "awercd";
        String b = "awercd";
        int i =0;
        int j =0;
        int opr=0;
        
        if(a.length()>b.length()){
            System.out.println(a.length()-b.length());}
        else if(a.length()<b.length()){
            System.out.println(b.length()-a.length());}   
        else{
        for(i =0; i<a.length()-1;i++){
            if(a.charAt(i)!=b.charAt(j)){ 
                opr++; 
            }
        j++;    
        }
        System.out.println(opr);
        }
    }   
}
