/**
 * leetcode344
 */
public class leetcode345 {

    public static void main(String[] args) {
        
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int f = 0;
        int e = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
    
        while (f < e) {
            if (isVowel(sb.charAt(f)) && isVowel(sb.charAt(e))) {
                // Swap vowels
                char temp = sb.charAt(f);
                sb.setCharAt(f, sb.charAt(e));
                sb.setCharAt(e, temp);
                f++;
                e--;
            } else {
                // Move pointers if characters are not vowels
                if (!isVowel(sb.charAt(f))) f++;
                if (!isVowel(sb.charAt(e))) e--;
            }
        }
    
        return sb.toString();
    }
    
    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}