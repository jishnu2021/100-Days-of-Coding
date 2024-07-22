import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3, 3, 4, 4 };
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (!l.contains(a[i])) { // Check if element is already in the list
                l.add(a[i]); // Add element to list if it's not already there
            }
        }

        System.out.println("Original Array: " + java.util.Arrays.toString(a));
        System.out.println("List with duplicates removed: " + l);
    }
}
