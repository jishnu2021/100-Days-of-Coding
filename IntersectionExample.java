import java.util.HashSet;
import java.util.Set;

public class IntersectionExample {
    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for(int num : arr2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        return set2;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 3, 5};
        
        System.out.println(findIntersection(array1, array2)); // Output: [2, 3]
    }
}
