class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0; // sum of elements in the array
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        
        // expected sum formula: n * (n + 1) / 2
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        
        // missing number is the difference
        return actualSum - sum;
    }
}