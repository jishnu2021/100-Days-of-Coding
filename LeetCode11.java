class Leetcode11 {
    public int maxArea(int[] height) {+
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width between the lines.
            int width = right - left;

            // Calculate the height of the shorter line.
            int h = Math.min(height[left], height[right]);

            // Update the maximum area if needed.
            maxArea = Math.max(maxArea, width * h);

            // Move the pointers based on the shorter line, as moving the longer one won't increase the area.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Leetcode11 solution = new Leetcode11();
        int result = solution.maxArea(height);
        System.out.println("Maximum Area: " + result);
    }
}
