public class FirstOccur {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0; // Needle is an empty string, so it's always present at the beginning.
        }

        if (needle.length() > haystack.length()) {
            return -1; // Needle is longer than haystack, so it can't be a substring.
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1; // Needle was not found in haystack.
    }

    public static void main(String[] args) {
        FirstOccur solution = new FirstOccur();
        String haystack = "leetcode";
        String needle = "leeto";
        int result = solution.strStr(haystack, needle);
        System.out.println(result); // Output: 2 (The first occurrence of "ll" in "hello" starts at index 2)
}
}