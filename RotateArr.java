// import java.util.ArrayList;

// public class RotateArr {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6,7};
//         reverse(arr);
//     }
   
//     private static void reverse(int[] arr) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-1;j++){
//                 if(arr[j]<arr[j+1]){
//                     int temp=arr[j+1];
//                     arr[j+1]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+",");
//         }
//     }
// }

/**
 * RotateArr
 */
// public class RotateArr {

//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6,7};
//         int[] ans=rotate(arr, 3);
//         for(int num : ans) {
//             System.out.print(num + " ");
//         }
//     }

//     private static int[] rotate(int[] arr, int k) {
//         int n = arr.length;

//         reverse(arr,0,n-1);
//         reverse(arr,0,k-1); 
//         reverse(arr,k,n-1);

//         return arr;
//     }

//     private static void reverse(int[] arr, int start, int end) {

//         while(start<end){
//             int tem=arr[start];
//             arr[start]=arr[end];
//             arr[end]=tem;
//             start++;
//             end--;
//         }

//     }
// }

/**
 * RotateArr
 */
// public class RotateArr {

//     public static void main(String[] args) {
//         int[] arr = {3,2,2,2,4,3};
//         System.out.println(majorelement(arr));
//     }

//     private static int majorelement(int[] arr) {
//         int c=0;
//         int k=0;

//         for(int i=0;i<arr.length;i++){
//             if(c==0){
//                 k=arr[i];
//             }

//             if(k==arr[i]){
//                 c++;
//             }else{
//                 c--;
//             }
//         }
//         return k;
//     }
// }