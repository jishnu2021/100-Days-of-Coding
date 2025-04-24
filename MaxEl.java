import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxEl {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,834,220,4,22,999,21};
        // Method1
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);

        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        // Method3 Stream
        // int max = Arrays.stream(arr).max().getAsInt();
        // System.out.println(max);


        PriorityQueue<Integer> map = new PriorityQueue<>((a,b)-> b-a);
        for(int val : arr){
            map.add(val);
        }
        System.out.println(map.peek());

    }
}
