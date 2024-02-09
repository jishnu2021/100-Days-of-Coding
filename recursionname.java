public class recursionname {
    public static void main(String[] args) {
        repeat(10);
    }

    static void repeat(int n){
        if(n==0){
            return;
        }
        System.out.println("Jishnu:"+n);
        repeat(n-1);
    }
}
