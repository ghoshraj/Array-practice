package array;

class merge{
    void merge(int [] arr , int start , int mid , int end){
        int l = mid - start + 1;
        int r = end - mid;
        int leftsubarray[] = new int[l];
        int rightsubarray[] = new int[r];

        for (int i = 0; i < l; ++i){
            leftsubarray[i] = arr[start + i];
        }
        for (int j = 0; j < r; ++j){
            rightsubarray[j] = arr[mid + 1 + j];
        }
        int i = 0 , j = 0;
        int k = start;
        while (i < l && j < r){
            if (leftsubarray[i] <= rightsubarray[j]){
                arr[k] = leftsubarray[i];
                i++;
            }
            else {
                arr[k] = rightsubarray[j];
                j++;
            }
            k++;
        }
        while (i < l){
            arr[k] = leftsubarray[i];
            i++;
            k++;
        }
        while (j < r){
            arr[k] = rightsubarray[j];
            j++;
            k++;
        }
    }
    void mergesort(int [] arr , int start , int end){
        if (start < end){
            int mid = (start + end)/2;
            mergesort(arr , start , mid);
            mergesort(arr,mid + 1,end);
            merge(arr,start,mid,end);
        }
    }
}
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {50,10,30,40,20};
        merge m = new merge();
        m.mergesort(arr , 0 ,arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
