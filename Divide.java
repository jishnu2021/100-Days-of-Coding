public class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge cases
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        // Determine signs
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        int result = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Iterative subtraction
        while (dividend >= divisor) {
            int temp = divisor;
            int count = 1;
            while (temp <= dividend - temp) {
                temp <<= 1;
                count <<= 1;
            }
            dividend -= temp;
            result += count;
        }

        // Apply sign
        return isNegative ? -result : result;
    }
} Divide {
    
}
