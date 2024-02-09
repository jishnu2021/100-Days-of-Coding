// import java.util.ArrayList;

// public class arrlist {
//     public static void main(String[] args) {
//        int[] arr={2,4,6,8,31,53,75,97,53};
//        System.out.println(findindex(arr,0,53));
//     }

//     private static ArrayList<Integer> findindex(int[] arr, int i,int t) {
//         ArrayList<Integer> list =new ArrayList<>();

//         if(i==arr.length){
//             return list;
//         }
//         if(t==arr[i]){
//             list.add(i);
//         }

//         ArrayList<Integer> ansbelow = findindex(arr, i+1, t);
//         list.addAll(ansbelow);

//         return list;
//     }
// }

/**
 * arrlist
 */

 // Rotated Binary Search using recursion
public class arrlist {

    public static void main(String[] args) {
        int[] arr={ 5,6,8,9,1,14,67,1,2,3};
        System.out.println(findindex(arr,0,arr.length-1,67));
    }

    private static int findindex(int[] arr, int s, int e, int t) {
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==t){
            return mid;
        }
        
        if(arr[s] <= arr[mid]){
            if(t>=arr[s] && arr[mid]>=t){
                return findindex(arr, s, mid-1, t);
            }else{
                return findindex(arr, mid+1, e, t);
            }
        }

        if (t>=arr[mid] && t<=arr[e]) {
            return findindex(arr, mid+1, e, t);
        }

        return findindex(arr, s, mid-1, t);
    }
}
