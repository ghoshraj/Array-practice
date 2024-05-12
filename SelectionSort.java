package array;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {20,50,60,10,30,40};
        int n = arr.length;
        for (int i = 0; i < n- 1; i++){
            int loc = i;
            for (int j = i+1; j< n; j++){
                if (arr[j] < arr[loc])
                    loc = j;
            }
            int temp = arr[i];
            arr[i] = arr[loc];
            arr[loc] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
