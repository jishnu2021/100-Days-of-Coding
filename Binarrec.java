public class Binarrec {
    public static void main(String[] args) {
     int[] arr={1,2,4,6,8,9};
     int target = 6;
     int result = bsearch(arr,target,0,arr.length-1);

     
     if (result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Element not found in the array.");
    }

    }

    static int bsearch(int[] arr, int target, int s ,int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        
        if(arr[mid]==target){
            return mid;
        }

        if(target>arr[mid]){
            return bsearch(arr, target, mid+1, e);
        }

        return bsearch(arr, target, s, mid-1);
    }
}
