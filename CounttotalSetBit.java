public class CounttotalSetBit {
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(printCount(n));
    }

    public static int printCount(int n){
        int count = 0;
        for(int i = 1;i<=n ;i++){
            count += Integer.bitCount(i);
        }

        return count;

    }    
}