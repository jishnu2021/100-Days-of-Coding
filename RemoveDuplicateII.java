public class RemoveDuplicateII {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 2, 2, 3};
        int[] result = removeDuplicates(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return new int[0]; // Return an empty array if nums is empty
        }

        int n = nums.length;
        int ind = 0;
        int[] res = new int[n];
        res[ind++] = nums[0]; // Include the first element initially
        
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                res[ind++] = nums[i];
            }
        }

        // Create a new array with correct size
        int[] result = new int[ind];
        System.arraycopy(res, 0, result, 0, ind);

        return result;
    }
}
