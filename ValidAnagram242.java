import java.util.HashMap;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character,Integer> charcount = new HashMap<>();

        for(char c : s.toCharArray()){
            charcount.put(c, charcount.getOrDefault(c, 0)+1);
        }
        for(char c: t.toCharArray()){
            if(!charcount.containsKey(c)){
                return false;
            }
            charcount.put(c, charcount.get(c)-1);
            if(charcount.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
