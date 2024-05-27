package array;

import java.util.HashSet;
import java.util.Set;

public class MergeTwoArray {
    public static void main(String[] args) {

        int[] a={1,2,3,4,1};
        int[] b={4,6,2,1,1};
        Set s=new HashSet();

        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            s.add(b[j]);
        }
        for(Object o: s){
            System.out.println((int)(o));
        }
    }
}
