import java.util.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int zero = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                count++;
            } else if (arr.get(i) == 0) {
                zero++;
            } else {
                neg++;
            }
        }

        System.out.println((float) count / n);
        System.out.println((float) neg / n);
        System.out.println((float) zero / n);
    }

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);
        plusMinus(arr);
    }
}
