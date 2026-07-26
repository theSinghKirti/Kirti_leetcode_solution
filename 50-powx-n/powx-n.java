class Solution {
    public double myPow(double x, int n) {
        long binForm = n;
        if (binForm < 0) {
            x = 1 / x;
            binForm = -binForm;
        }
        
        double ans = 1;
        double currentProduct = x;
        
        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= currentProduct;
            }
            currentProduct *= currentProduct;
            binForm /= 2;
        }
        
        return ans;
    }
}