import java.util.HashMap;

public class Anagram {
    static HashMap<Character,Integer> Frequency(String s){
     HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int curr=mp.get(ch);
                mp.put(ch, curr+1);
            }
            
        }
        return mp;
    }
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp = Frequency(s);

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) {
                return false;
            } else {
                int curr = mp.get(ch);
                mp.put(ch, curr - 1);
            }
        }

        for (int k : mp.values()) {
            if (k != 0) {
                return false;
            }
        }
        
        return true;
    }
        
    
    
    public static void main(String[] args) {
        String s1="keen";
        String s2="knee";
        
        boolean result=isAnagram(s1,s2);
    
        if(result){
            System.out.println("Anagram");
        }else{
            System.out.println("Is not Anagram");
        }
    
        }
    

}
