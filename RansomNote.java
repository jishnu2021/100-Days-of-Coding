import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomnote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomnote, magazine));
    }

    public static boolean canConstruct(String ransomnote, String magazine) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character in the magazine
        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check if the ransom note can be constructed from the magazine
        for (char c : ransomnote.toCharArray()) {
            if (charCount.getOrDefault(c, 0) > 0) {
                charCount.put(c, charCount.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
