package array;

public class Print_Array {
    public static void main(String[] args) {
        int[]a = {10,20,30};
        int[]b = a;
        b[0] = 40;
        System.out.println(a[0]);
        for (int i = 1; i <a.length;i++){
            System.out.println(a[i]);
        }
    }
}
