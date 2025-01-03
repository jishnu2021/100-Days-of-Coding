import java.util.ArrayList;
import java.util.List;

class combinationAdd {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remaining, int start) {
        if (remaining < 0) {
            return; // If remaining is less than 0, no valid combination
        } else if (remaining == 0) {
            result.add(new ArrayList<>(tempList)); // If remaining is 0, found a valid combination
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remaining - candidates[i], i); // Not i + 1 because we can reuse the same element
                tempList.remove(tempList.size() - 1); // Remove last element to backtrack
            }
        }
    }
}
