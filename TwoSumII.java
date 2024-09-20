public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr, target);

        if(result[0] == 0 && result[1]==0){
            System.out.println("No valid pair found");
        }else{
            System.out.println("Indices: "+result[0]+", "+result[1]);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] ans = new int[2];
        while (start < end) {
            int res = numbers[start]+numbers[end];

            
            if(res == target){
                ans[0] = start+1;
                ans[1] = end+1;
            }

            if(res > target){
                end --;
            }else{
                start++;
            }

        }
        
    return ans;
    }
}
