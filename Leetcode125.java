/**
 * Leetcode125
 */
public class Leetcode125 {

    public static void main(String[] args) {
        System.out.println(palindromestring("race a car"));
    }

    private static boolean palindromestring(String s) {
        if(s.isEmpty()){
            return true;
        }
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int start =0;
        int end=s2.length()-1;

        while( start <= end){
            if(s2.charAt(start) != s2.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}