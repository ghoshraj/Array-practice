package array;

public class SecondBiggest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,60,40,50};
        int max = arr[0];
        int max1 = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
               max1 = max;
               max = arr[i];
            }
            else if (arr[i] > max1){
                max1 = arr[i];
            }
        }
        System.out.println(max1);
    }
}
