public class LeetCode7 {
    public static int isReverse(int n){

        int sum=0;

        while(n != 0){                     
            int rem=n%10; 
            sum=sum*10+rem;
            n=n/10;                 
        }
        

        return sum;
    }
    public static void main(String[] args) {
     int n=-123;
     int c= isReverse(n);
     System.out.println(c);   
    }
}
