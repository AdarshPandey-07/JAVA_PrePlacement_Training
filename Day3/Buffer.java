public class Buffer {
    
    public static void main(String[] args) {

        String str = "Ashish";
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
                
        StringBuffer sb2 = new StringBuffer("Prashant");
        String str1 = sb2.toString();
        System.out.println(str1);
    }   
}
