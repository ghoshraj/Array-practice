package array;

public class FindElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int num = 5;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == num)
                System.out.println(i);
        }
    }
}
