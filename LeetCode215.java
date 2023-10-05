import java.util.Arrays;

/**
 * LeetCode215
 */
public class LeetCode215 {
    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        int[] sortedArray = new int[len];

        
        System.arraycopy(nums, 0, sortedArray, 0, len);
        Arrays.sort(sortedArray);

        
        for (int i = 1; i < len; i++) {
            if (sortedArray[i - 1] == sortedArray[i]) {
                return true; 
            }
        }

        return false; 
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        boolean result = containsDuplicate(a);
        System.out.println(result); 
    }
}
