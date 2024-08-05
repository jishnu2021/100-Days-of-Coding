public class Insertpost {
    public static void main(String[] args) {
        // Example 1
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Output: 2

        // Example 2: Target not found, should be inserted at index 2
        int target2 = 2;
        int result2 = solution.searchInsert(nums, target2);
        System.out.println("Index of target " + target2 + ": " + result2); // Output: 1

        // Example 3: Target greater than all elements, should be inserted at index 4
        int target3 = 7;
        int result3 = solution.searchInsert(nums, target3);
        System.out.println("Index of target " + target3 + ": " + result3); // Output: 4

        // Example 4: Target less than all elements, should be inserted at index 0
        int target4 = 0;
        int result4 = solution.searchInsert(nums, target4);
        System.out.println("Index of target " + target4 + ": " + result4); // Output: 0
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If the target is not found, 'left' will be the position where 'target' should be inserted
        return left;
    }
}
