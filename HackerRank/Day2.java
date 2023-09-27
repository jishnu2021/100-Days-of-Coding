import java.util.List;

public class Day2 {

    public static void miniMaxSum(List<Integer> arr) {
        if (arr == null || arr.size() < 5) {
            // Handle the case when the list doesn't have enough elements
            System.out.println("List should have at least 5 elements.");
            return;
        }

        long sum = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        // Calculate the sum and find the minimum and maximum values
        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate the minimum and maximum sums
        long minSum = sum - max;
        long maxSum = sum - min;

        // Print the results
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> arr = List.of(1, 3, 5, 7, 9);
        miniMaxSum(arr);
    }
}
