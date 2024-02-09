public class LeetCode191 {
    public static void main(String[] args) {
        System.out.println(countone(11101));
    }

    private static int countone(int n) {
        int c=0;
        while(n>0){
            if(n%10==1){
                c++;
            }
        n=n/10;
    }
    return c;
}
}
