public class LeetCode69 {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = (left+right) / 2;
            long midSquared = mid * mid;

            if (midSquared == x) {
                return (int) mid;
            } else if (midSquared < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }

    public static void main(String[] args) {
        
        int n=8;
        int c=mySqrt(n);
        System.out.println(c);
    }
}
