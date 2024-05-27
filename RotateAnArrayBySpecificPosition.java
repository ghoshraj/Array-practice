package array;

public class RotateAnArrayBySpecificPosition {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int index = 3;
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            if (i == index){
                for (int j = arr.length - 1; j >= index; j--){

                }
            }
            System.out.println(arr[i]);
        }
    }
}
