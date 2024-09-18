public class IsSubsequence {

    public static void main(String[] args) {
        String s = "aec";
        String t = "ahbgdce";

        System.out.println(isSubsequence(s, t));  // Output: true
    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        
        int sIndex = 0; 
        int tIndex = 0;  
        
        
        while (sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;  // Move to next character in s
            }
            tIndex++;  // Always move to next character in t
        }
        
        // If sIndex equals sLength, all characters of s were found in t in order
        return sIndex == sLength;
  }
}