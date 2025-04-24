public class PriorElement {

    public static void main(String[] args) {
        int[] arr = { 7,4,8,2,9,2,3,6};

        System.out.println(priorFind(arr));
    }
        
    private static int priorFind(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                count ++;
                max = arr[i];
            }
        }
        return count;
                
    }
}