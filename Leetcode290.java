import java.util.HashMap;

public class Leetcode290 {
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";

        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        
        // If lengths differ, return false
        if (pattern.length() != arr.length) {
            return false;
        }
        
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];

            // Check the mapping from character to word
            if (!charToWord.containsKey(ch)) {
                // If the character is new, add the mapping
                charToWord.put(ch, word);
            } else {
                // If the character exists, check if it maps to the same word
                if (!charToWord.get(ch).equals(word)) {
                    return false; // Mismatch found
                }
            }

            // Check the mapping from word to character
            if (!wordToChar.containsKey(word)) {
                // If the word is new, add the mapping
                wordToChar.put(word, ch);
            } else {
                // If the word exists, check if it maps to the same character
                if (!wordToChar.get(word).equals(ch)) {
                    return false; // Mismatch found
                }
            }
        }

        return true; // All checks passed
    }
}
