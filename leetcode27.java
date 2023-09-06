
public class leetcode27 {
    public static void main(String[] args) {
        
        int[] a = {3, 2, 2, 3, 4, 4, 2, 3, 4, 4, 4, 3, 3, 3, 3};
        int val = 3;
        int newSize = removeValue(a, val);
    
        System.out.println("----Output-----");
        for (int i = 0; i < newSize; i++) {
            System.out.print(+a[i] +",");
        }
    }

    public static int removeValue(int[] nums, int val) {
        int newSize = 0;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newSize] = nums[i];
                newSize++;
            }else{
                count++;
            }
        }

        System.out.println("The cout is: "+count);
        return newSize;

    }

}

