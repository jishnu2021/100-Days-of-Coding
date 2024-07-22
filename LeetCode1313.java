import java.util.Scanner;

public class LeetCode1313 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        int[] ans = new int[4];
        
        System.out.println("Enter the array: ");
        for(int i=0;i<4;i++){
            nums[i] =sc.nextInt();
        }
        int k =0;
        for(int i=0;i<4;i+=2){
            int f = nums[i];
            int val= nums[i+1];

            for(int j =0 ; j<f ; j++){
                ans[k++]=val;
            }
        }

        System.out.println("Decompressed array");
        for (int i = 0; i < 4; i++) {
            System.out.println(ans[i]);
        }

    }
}
