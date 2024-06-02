package array;

public class RotateAnArrayBySpecificPosition {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int index = 3;
        int k=0;
        int b[] = new int[arr.length];
        for (int i = 0; i < index; i++){
            b[k++] = arr[i];
        }
        for(int i=arr.length-1;i>=index;i--){

            b[k++]=arr[i];
        }
//

        //Arrays.toString(arr);
        //Arrays.toString(b);
       // System.out.println(arr.toString());
        for (int o:arr
             ) {
            System.out.print(o+" ");
        }
        System.out.println();
        for (int o:b
        ) {
            System.out.print(o+ " ");
        }

    }
}
