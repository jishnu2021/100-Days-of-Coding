import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {
    public List<String> FizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add(Integer.toString(i));
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        LeetCode412 solution = new LeetCode412();
        int n = 15;
        
        List<String> result = solution.FizzBuzz(n);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            
            
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
