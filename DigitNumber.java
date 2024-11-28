import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(finddigitNumber(n));
        sc.close();
    }

    public static int finddigitNumber(int n) {
        while (n >= 10) {
            if (n % 2 != 0) {
                n = (n / 2); // Reduce n if it's odd
            } else {
                n = (n - 2) / 2; // If it's even, subtract 2 and divide
            }
        }

        return n; // Return the reduced n when it's less than 10
    }
}
