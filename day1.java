/**
 * Akash
 */
public class day1 {

    public static void main(String[] args) {
        int n = 15;
        int c = 0;
        int i = 1;
        prec(n, c, i);
    }

    static void prec(int n, int c, int i) {
        if (i <= n) {
            if (n % i == 0) {
                c++;
            }
            prec(n, c, i + 1);
        }

        if (i > n && c == 2) {
            System.out.println("Prime");
        } else if (i > n) {
            System.out.println("Not Prime");
        }
    }
}
