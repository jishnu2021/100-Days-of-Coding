import java.util.Scanner;

public class Cakepiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = (n*(n+1))/2;
        int ans = sum + 1;

         System.out.println(ans%1000000007);
    }
}
