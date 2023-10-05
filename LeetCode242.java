public class LeetCode242 {

public static boolean isAnagram(String s,String t){
    
    int x=s.length();
    int y=t.length();

    if(x!=y){
        return false;
    }
   else{
    int arr[]=new int[26];
    for(int i=0;i<x;i++){
        arr[s.charAt(i)-'a']++;
    }

    for(int i=0;i<y;i++){
        arr[t.charAt(i)-'a']--;
    }

    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            return false;
        }
    }
    return true;
   }


}
 public static void main(String[] args) {
    String s="anagram";
    String t="nagar";

    boolean result=isAnagram(s, t);
    System.out.println(result);
 }   
}
