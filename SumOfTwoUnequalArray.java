package array;

public class SumOfTwoUnequalArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};

        int maxLength = Math.max(array1.length, array2.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int num1 = 0;
            int num2 = 0;
            if (i < array1.length) {
                num1 = array1[i];
            }
            if (i < array2.length) {
                num2 = array2[i];
            }
            result[i] = num1 + num2;
        }
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
