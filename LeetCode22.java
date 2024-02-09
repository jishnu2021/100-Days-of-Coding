import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, n, "", result);
        return result;
    }

    private void generateParenthesisHelper(int left, int right, String current, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(current);
            return;
        }

        if (left > 0) {
            generateParenthesisHelper(left - 1, right, current + "(", result);
        }

        if (right > left) {
            generateParenthesisHelper(left, right - 1, current + ")", result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs: ");
        int n = sc.nextInt();

        LeetCode22 solution = new LeetCode22();
        List<String> result = solution.generateParenthesis(n);

        System.out.println("Generated Parenthesis Combinations:");
        for (String combination : result) {
            System.out.println(combination);

        }

        sc.close();
    }
}
