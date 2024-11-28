import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {

    // public static int findKthMax(int[] arr , int k){
    //     for(int i = 0 ;i<arr.length;i++){
    //         for(int j=1;j<arr.length-i;j++){
    //             if(arr[j-1]<arr[j]){
    //                 int temp = arr[j-1];
    //                 arr[j-1] = arr[j];
    //                 arr[j] = temp;
    //             }
    //         }
    //     }
    //     int val=0;
    //     for(int r = 0;r<k ;r++){
    //         val = arr[r];
    //     }
    //     return val;

    // }

    public static int findKthMax(int[] arr , int k){
        Arrays.sort(arr);

        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Kth value is : ");
        int k = sc.nextInt();
        System.out.print("The nth value is : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int Kthmax = findKthMax(arr,k);
        System.out.println(Kthmax);
        sc.close();
    }
}
