public class LeetCode202 {

    public static boolean isHappy(int n){
        if (n == 1) {
            return true;
        } else if (n == 4) {
            return false;
        } else {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return isHappy(sum);
        }
        
    }
    public  static void  main(String[] args) {
        int n=19;
        boolean result = isHappy(n);

        System.out.println(result);
    }
}
