public class RotateArrayClockWise {
    public static void main(String[] args) {
        int[] arr = { 1 , 2,3,4};
        int k = 5;

        int[] ans = rotatehelper(arr,k);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] rotatehelper(int[] arr ,int k){
        int n = arr.length;
        k = k % n;  // To handle k greater than n

        reverse(0, n - k - 1, arr);  // Reverse the first part
        reverse(n - k, n - 1, arr);  // Reverse the second part
        reverse(0, n - 1, arr);      // Reverse the whole array

        return arr;

    }

    public static void reverse(int s,int l,int[] arr){
        while(s<l){
            int temp = arr[s];
            arr[s] = arr[l];
            arr[l] = temp;

            s++;
            l--;
        }
    }
}
