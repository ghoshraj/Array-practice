package array;

public class MaxDiffernceBetweenTwoElement {
    public static void main(String[] args) {
        int arr[] = {10,20,23,33,32,44};
        int sub = 0;
        for (int i = 1; i < arr.length; i++){
            int n =arr[i] - arr[i - 1];
            if (n > sub)
                sub = n;
        }
        System.out.println(sub);
    }
}
