public class MaxArea {
    public static void main(String[] args) {
       int[] arr = {1,8,6,2,5,4,8,3,7};
       System.out.println(maxArea(arr));
        
    }
    
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = 0;

        while (start < end) {
            int curr = Math.min(height[start],height[end])*(end-start);
            max = Math.max(curr, max);

            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }

}
