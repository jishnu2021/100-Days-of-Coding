public class ReverseString {
    public static void main(String[] args) {
        String s  = "Hello World";
        System.out.print(helper(s));
    }
    public static String helper(String s){

        char[] arr = s.toCharArray();

        int st = 0 , e = arr.length -1;

        while(st<e){
            char a = arr[st];
            arr[st] = arr[e];
            arr[e] = a;
            st++;
            e--;
        }

        return new String(arr);
    }
}
