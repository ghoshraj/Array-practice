package array;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {60,10,20,40,50,30};
        for (int i = 1; i < arr.length; i++){
            int key=arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                 arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
