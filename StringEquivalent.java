public class StringEquivalent {
    public static void main(String[] args) {
        String a = "aaaa";
        String b = "bb99cc";
        System.out.println(checkAlmostEquivalent(a,b));
    }
    public static boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26]; // Array to store frequency differences

        // Update frequency differences
        for (int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;
            freq[word2.charAt(i) - 'a']--;
        }

        // Check if any frequency difference exceeds 3
        for (int count : freq) {
            if (Math.abs(count) > 3) {
                return false;
            }
        }

        return true;
    }
}
