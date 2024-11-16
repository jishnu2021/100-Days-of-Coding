/**
 * SuperiorElement
 */
public class SuperiorElement {

    public static void main(String[] args) {
        int[] arr =  {8,10,6,2,9,7,5,1};
        int n = arr.length;
        int result = findSuperiorelments(arr,n);
        System.out.println("The total superior elements is " + result);
    }
    public static int findSuperiorelments(int[] arr, int n){
        int count = 0;
        int maxrightelement = Integer.MIN_VALUE;

        for(int i=n-1; i>=0 ;i--){
            if(arr[i] > maxrightelement){
                count++;
                maxrightelement = arr[i];
            }
        }

        return count;
    }
}