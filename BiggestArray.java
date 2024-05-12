package array;

public class BiggestArray {
    public static void main(String[] args) {
        int a[] = {10,5,50,30,20,40};
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Biggest element in the array is : " + max);
    }
}
