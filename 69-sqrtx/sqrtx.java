class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        
        int left = 1;
        int right = x;
        int result = 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            
            long squared = (long) mid * mid;
            
            if (squared == x) {
                return mid;
            } else if (squared < x) {
                // Th
                result = mid;
                left = mid + 1;
            } else {
                // Square is too large, search in the left half
                right = mid - 1;
            }
        } // The while loop ends here
        
        return result; // Move this line outside the while loop
    }
}