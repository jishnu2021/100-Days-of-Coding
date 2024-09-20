import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode30 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = findSubstring(s, words);
        System.out.println(result);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        int wordLength = words[0].length();
        int wordsCount = words.length;
        int totalLength = wordLength * wordsCount;

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i <= s.length() - totalLength; i++) {
            HashMap<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < wordsCount) {
                int wordStartIndex = i + j * wordLength;
                String word = s.substring(wordStartIndex, wordStartIndex + wordLength);

                if (wordCount.containsKey(word)) {
                    seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                    if (seenWords.get(word) > wordCount.get(word)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == wordsCount) {
                result.add(i);
            }
        }
        return result;
    }
}
