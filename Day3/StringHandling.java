public class StringHandling {

    public static void main(String[] args) {
       
        String a = "Adarsh";
        String b = "Pandey";
        String c = "Adarsh";
        String d = " Adarsh";
        
        System.out.println(a.charAt(0)); //M
        System.out.println(a.charAt(3)); //a
        
        System.out.println(a.indexOf("A")); //0
        System.out.println(a.indexOf("d")); //1
        System.out.println(a.lastIndexOf("a")); //3
        
        System.out.println(a.startsWith("A")); //true
        System.out.println(a.startsWith("Adarsh")); //true
        System.out.println(a.startsWith("Adarsh")); //false
        
        System.out.println(a.endsWith("s")); //true
        System.out.println(a.endsWith("dar")); //true
        System.out.println(a.endsWith("Adarsh")); //false
        
        System.out.println(a.equals(a)); //true
        System.out.println(a.equals(b)); //false
        System.out.println(a.equals(c)); //false
        
        System.out.println(a.equalsIgnoreCase(c)); //true
          
        System.out.println(d); 
        System.out.println(d.trim()); 
        
        System.out.println(a.replace("a","i")); 
        
        System.out.println(a.substring(0)); 
        System.out.println(a.substring(2)); 
        System.out.println(a.substring(0,4)); 
        
        byte b1[] = a.getBytes();
        for(int i=0; i<b1.length;i++){
            System.out.print(b1[i]+" ");
        }
        System.out.println();
        
    }   
}
