public class PalindromeNumber {


    public static boolean palin(int n){
        int x=n;
        int sum=0;

        if(x<0)
        return false;
        

        while(x>0){
            int r=x%10;
            sum=sum*10 + r;
            x=x/10;
        }
        return sum==n;
        

    }
    public static void main(String[] args) {
        int n=1211;

        boolean p=palin(n);
        if(p){
            System.out.println(n + " is a palindrome Number");
        }else{
            System.out.println(n+" is not a palindrome number");
        }
    }
}
