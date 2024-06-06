package array;

public class LeadershipArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 50, 40, 30};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    flag = false;
            }
            if (flag)
                System.out.println(arr[i]);
        }
    }
}
