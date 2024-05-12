package array;

public class ZeroRight {
    public static void main(String[] args) {
        int arr[] = {0,7,0,3,0,1,5};
        int b[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != 0){
             b[j++] = arr[i];
            }
        }
        for (int i = 0;i < arr.length; i++){
            System.out.println(b[i]);
        }
    }
}
