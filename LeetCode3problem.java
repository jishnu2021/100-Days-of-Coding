import java.util.HashSet;

/**
 * LeetCode3problem
 */
public class LeetCode3problem {
    public static void main(String[] args) {
        String s = "bbbbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        int left = 0;

        HashSet<Character> seen = new HashSet<>();

        for(int right=0;right<s.length();right++){
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));

            max = Math.max(max, right-left+1);

        }
        return max;
        
    }
}