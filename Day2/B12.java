//copy an array into another array

import java.util.*;
class B12
{
    public static void main (String[] args){
        int a1[] = new int[]{55,22,65,89,21};
        int a2[] = Arrays.copyOf(a1, 6);
            System.out.println(Arrays.toString(a2));
            int a3[] = new int[10];
            System.arraycopy(a2, 0, a3, 0, 6);
            System.out.println(Arrays.toString(a3));

    }
}