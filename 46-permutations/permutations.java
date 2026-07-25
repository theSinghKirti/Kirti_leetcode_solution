import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // If the temporary list matches the size of nums, we found a complete permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // Skip if the element is already included in the current permutation
            if (tempList.contains(nums[i])) continue;
            
            // Choose
            tempList.add(nums[i]);
            // Explore
            backtrack(result, tempList, nums);
            // Un-choose (backtrack)
            tempList.remove(tempList.size() - 1);
        }
    }
}