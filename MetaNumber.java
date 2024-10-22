import java.util.Scanner;

public class MetaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = findmetanumbers(n);
        System.out.println(ans);
    }

    public static int findmetanumbers(int n){
        int count = 0;

        while(n>0){
            if(n%2 == 0 && n%4 == 0 && n%8 == 0 && n%10 != 0){
                count++;
            }
            n--;
        }
        return count;
    }
}
