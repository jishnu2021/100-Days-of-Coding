import java.util.Scanner;

public class Studentsarrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(findposibilities(a,b));
    }

    public static int findposibilities(int a , int b){
        int ans = (a+b)/4;
        int val = Math.min(a, b);
        if(ans<=val){
            return ans;
        }

        return val;
    }
}
