import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
            HashMap<Character,Integer> set = new HashMap<>();

            int maxlen = 0 , start =0;

            for(int i=0;i<s.length();i++){
                char cur = s.charAt(i);
                if(set.containsKey(cur) && set.get(cur)>=start){
                    start = set.get(cur)+1;
                }
                
                
                set.put(cur, i);

                maxlen = Math.max(maxlen, i-start+1);
            }

            return maxlen;
        }
    
        // Main method to test the function
        public static void main(String[] args) {
            
            // Test cases
            String s1 = "abcabcbb";
            String s2 = "bbbbb";
            String s3 = "pwwkew";
            String s4 = "";
    
            System.out.println("Length of longest substring without repeating characters in \"" + s1 + "\": " + lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Length of longest substring without repeating characters in \"" + s2 + "\": " + lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Length of longest substring without repeating characters in \"" + s3 + "\": " + lengthOfLongestSubstring(s3)); // Output: 3
        System.out.println("Length of longest substring without repeating characters in \"" + s4 + "\": " + lengthOfLongestSubstring(s4)); // Output: 0
    }
}