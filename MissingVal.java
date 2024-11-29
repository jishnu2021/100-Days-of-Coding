public class MissingVal {
    public static void main(String[] args) {
        int[] arr = {5,4,6,1,3};

        System.err.println(findval(arr));
    }
    public static int findval(int[] nums){
        int n = nums.length;
            
            // // Place each number in its right place
            for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    // Swap nums[i] with nums[nums[i] - 1]
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }
            
            // Identify the first missing positive
            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }
            
            // If all numbers are in place, the first missing positive is n+1
            return n + 1;
    }
}
