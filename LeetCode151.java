public class LeetCode151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String t = " Hello World ";
        
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(t));
  }
  public static String reverseWords(String s){
    String[] words = s.trim().split("\\s+");

    StringBuilder str = new StringBuilder();
    for(int i = words.length - 1; i>=0 ;i--){
        str.append(words[i]);

        if(i != 0){
            str.append(" ");
        }
    }
    return str.toString();

  }
}