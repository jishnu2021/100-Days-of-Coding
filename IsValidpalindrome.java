/**
 * IsValidpalindrome
 */
public class IsValidpalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}