package array;

public class SecondSmallest {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        int s1 = arr[0];
        int s2 = arr[0];
        for (int i = 0; i < arr.length; i++){
//            if (s1 == arr[i])
//                continue;
            if (arr[i] < s1){
                s2 =s1;
                s1 = arr[i];
            }
            else if (arr[i] <s2 || s1 == s2){
                s2 = arr[i];
            }
        }
        System.out.println(s2);
    }
}
