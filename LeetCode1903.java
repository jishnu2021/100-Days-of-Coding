public class LeetCode1903 {
    public static void main(String[] args) {
        String s = "52";
        String t = "4206";
        String p = "35427";

        System.out.println(largestOddNumber(s));
        System.out.println(largestOddNumber(t));
        System.out.println(largestOddNumber(p));
    }
    public static String largestOddNumber(String num) {
        // char[] arr = num.toCharArray();
       for(int i = num.length() -1 ;i>=0;i--){
        int digit = num.charAt(i);
        if((digit-'0')%2 != 0){
            return num.substring(0, i+1);
        }
       }

       return "";
    }
}
