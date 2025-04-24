public class LuckyNum {
    public static void main(String[] args) {
        luckyNum(16);   // Lucky
        luckyNum(38);   // Lucky
        luckyNum(666);  // Lucky
        luckyNum(687);  // Not Lucky
        luckyNum(234);  // Not Lucky
        luckyNum(6);    // Not Lucky (Single digit)
        luckyNum(8);    // Not Lucky (Single digit)
        luckyNum(5);    // Not Lucky (Single digit)
    }

    public static void luckyNum(int n) {
        if (n < 10) { // Any single-digit number is NOT lucky
            System.out.println("Not Lucky");
            return;
        }

        boolean hasSix = false, hasEight = false;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 6) hasSix = true;
            if (rem == 8) hasEight = true;
            n = n / 10;
        }

        if ((hasSix || hasEight) && !(hasSix && hasEight)) {
            System.out.println("Lucky");
        } else {
            System.out.println("Not Lucky");
        }
    }
}
