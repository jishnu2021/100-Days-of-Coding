public class Tcsnqtdaythree {
    public static void main(String[] args) {
        int n = 5244;
        System.out.println(multi(n));
    }
        
    private static int multi(int n) {
        int sum = 1;
        while (n>0) {
            int rem = n%10;
            sum = sum * rem;
            n = n/10;
        }     
        
        return sum;
    }
}
