public class LeetCode136 {
    public static int singleNumber(int[] nums) {
        int c = 0; 

        for (int i = 0; i < nums.length; i++) {
            boolean found = false; 

            for (int j =0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    found = true;
                    break; 
                }
            }

            if (!found) {
                c = nums[i]; 
                break; 
            }
        }
        
        return c;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1};
        int n = singleNumber(nums);
        System.out.println(n);
    }
}
