import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }

        System.out.println(maxLength);
    }
}
