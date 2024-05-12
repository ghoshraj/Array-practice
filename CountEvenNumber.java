package array;

public class CountEvenNumber {
    public static void main(String[] args) {
        int [] arr = {10,20,3,40,50};
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0)
                count++;
        }
        System.out.println(count);
    }
}
