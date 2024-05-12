package array;

class quick{
    int partition(int [] arr , int start , int end){
        int pivot = arr[end];
        int pindex = start;
        for (int i = start; i < end; i++){
            if (arr[i] <= pivot){
                int t = arr[pindex];
                arr[pindex] = arr[i];
                arr[i] = t;
                pindex++;
            }
        }
        int t = arr[pindex];
        arr[pindex] = arr[end];
        arr[end] = t;
        return pindex;
    }
    void quicksort(int [] arr , int start , int end){
        if (start < end){
            int p = partition(arr,start ,end);
            quicksort(arr,start,p-1);
            quicksort(arr , p+1,end);
        }
    }
}
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {50,10,30,40,20,90,5};
        quick q = new quick();
        q.quicksort(arr,0,arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
