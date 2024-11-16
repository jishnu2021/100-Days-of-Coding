import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 6, 7, 5, 2};
        int[] result = withoutDuplicates(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] withoutDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);       // Add to set to mark it as seen
                list1.add(num);     // Add to list for output
            }
        }
        
        // Convert list to int[] array
        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            result[i] = list1.get(i);
        }
        
        return result;
    }
}
