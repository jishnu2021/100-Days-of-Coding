public class RemovelastBit {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Removelast(n));
    }
    public static int Removelast(int n){
        int tem = n - 1;

        return n & tem;
        
    }
}
