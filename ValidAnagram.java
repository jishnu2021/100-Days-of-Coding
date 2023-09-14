import java.util.*;
public class ValidAnagram {
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

    public static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        HashMap<Character,Integer> mp1=Frequency(s1);
        HashMap<Character,Integer> mp2=Frequency(s2);
        
        return mp1.equals(mp2);


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
