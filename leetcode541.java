public class leetcode541 {
    public static void main(String[] args) {
        System.out.println(reverseig("abcdefg",2));
    }

    private static String reverseig(String s,int k) {
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i =0;i<n;i+=2*k){
            int start =i;
            int end = Math.min(i+k-1,n-1);

            while(start<end){
                char t = a[start];
                a[start]=a[end];
                a[end]=t;
                start++;
                end--;
            }
        }
        return new String(a);
    }
}
