import java.util.Arrays;

public class FindMaxParking {

    public static void main(String[] args) {
        int arr[] = {1,1,3,3,4};
        System.out.println(helper(arr));
    }
    public static int helper(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] < i+1){
                count++;
                arr[i] = i+1;
            }
        }

        return count;
    }
}