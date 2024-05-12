package array;

public class ReverseArray {
    static void reverse(int[]a,int n){
        int [] b = new int[n];
        int j = n;
        for (int i = 0; i < a.length; i++){
            b[j-1] = a[i];
            j--;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(b[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        reverse(a,a.length);
    }
}
