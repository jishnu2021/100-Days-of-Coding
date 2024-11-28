/**
 * FindCount
 */
public class FindCountVal {

    public static void main(String[] args) {
        int[] arr = {5,8,7,5,8,9};
        int len = arr.length;

        int result = FindCount(arr, len);
        System.out.println("The ans is" + result);
    }
    public static int FindCount(int[] arr , int length){
        int count = 0;
        
        for(int i=0 ;i<length;i++){
            int f = 0;
            for(int j=i+1;j<length;j++){
                if(arr[i] == arr[j]){
                    f = 1;
                    break;
                }
            }
            if(f == 0){
                count ++;
            }
        }
        return count;
    }
}