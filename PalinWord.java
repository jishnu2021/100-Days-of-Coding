/**
 * PalinWord
 */
public class PalinWord {

    public static void main(String[] args) {
        String s="deifiede";

        int c=0;

       for(int i=0;i<s.length();i++){
        if(s.charAt(i) != ' '){
            c++;
        }
       }
       int len =c;

    int start=0;
    int end=len-1;

    while (start<end) {
        if(s.charAt(start)==s.charAt(end)){
            start=start+1;
            end=end-1;
        }else{
            break;
        }
    }

    if(start==end){
        System.out.println("palindrome");
    }else{
        System.out.println("Not palindrom");
    }

       
    }
}