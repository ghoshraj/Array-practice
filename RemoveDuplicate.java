package array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Set s = new LinkedHashSet();
        int arr[] = {10,20,30,40,20,10};
        for (int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }
        for (Object e : s){
            System.out.println(e);
        }
    }
}
