public class Anagram {
    
    public static void main(String[] args) {
       
        String a = "heart";
        String b = "earth";
        int opr=0;
        for(int i=0; i<a.length();i++){
            for(int j=0; j<a.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    opr++;
                }
            }
        }
        if(opr==a.length())
        System.out.println("Anagram");
    }   
}
