// public class AirportSort {
//     public static void main(String[] args) {
//         int[] arr = {1,0,1,2,0,0,1,2};
//         sortairport(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + ",");
//         }
        
//         }
        
//         private static void sortairport(int[] arr) {
//             int n = arr.length - 1;
//             for(int i=0;i<n-1;i++){
//                 for(int j=0;j<n-i-1;j++){
//                     if(arr[j] > arr[j+1]){
//                         int temp = arr[j];
//                         arr[j] = arr[j+1];
//                         arr[j+1] = temp;
//                     }
//                 }
//             }
//         }
// }


public class AirportSort {

    public static void main(String[] args) {
        int[] arr = {1,0,1,2,0,0,1,2};
        sortairport(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + ",");
        }
    }

    public static int[] sortairport(int[] arr){
        int n = arr.length - 1;
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                countzero++;
            }
            if(arr[i] == 1){
                countone++;
            }
            if(arr[i] == 2){
                counttwo++;
            }
        }
        int j = 0;
        while(countzero>0){
            arr[j] = 0;
            countzero--;
            j++;
        }
        while(countone>0){
            arr[j] = 1;
            countone--;
            j++;
        }
        while(counttwo>0){
            arr[j] = 2;
            counttwo--;
            j++;
        }

        return arr;
    }
}
