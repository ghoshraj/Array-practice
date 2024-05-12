package array;

public class SmallestArray {
    public static void main(String[] args) {
        int a[] = {30 ,20, 40 ,10 ,60 ,50};
        int min = a[0];
        for (int i = 0; i <a.length;i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
