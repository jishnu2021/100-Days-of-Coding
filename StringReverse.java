public class StringReverse {
    public static void reverse(int n,String s){
        if(n==0){
            System.out.println(s.charAt(n));
            return;
        }
        System.out.println(s.charAt(n));
        reverse(n-1, s);
    }
    public static void main(String[] args) {
        String s="abcd";
     reverse(s.length()-1, s);   
    }
}
