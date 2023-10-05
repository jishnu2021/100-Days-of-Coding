public class LeetCode91 {
    public int numDecodings(String s) {
        if(s.length()<1){
            return 0;
        }
        if(s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }

        int val1=1;
        int val2=1;

        for(int i=1;i<s.length();i++){
            int d1=s.charAt(i)-'0';
            int d2=(s.charAt(i-1)-'0')*10 +d1;
            int curr=0;

            if(d1>=1){
                curr +=val2;
            }
            if(d2>=10 && d2<=26){
                curr +=val1;
            }

            val1=val2;
            val2=curr;
        }

        return val2;
    }
    public static void main(String[] args) {
        String s="226";
        LeetCode91 ob =new LeetCode91();
        int result = ob.numDecodings(s);
        System.out.println(result);
    }
}
