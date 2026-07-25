class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        int i = 0, j = 0;
        int starIdx = -1;
        int matchIdx = 0;
        
        while (i < m) {
            if (j < n && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < n && p.charAt(j) == '*') {
                starIdx = j;
                matchIdx = i;
                j++;
            } else if (starIdx != -1) {
                j = starIdx + 1;
                matchIdx++;
                i = matchIdx;
            } else {
                return false;
            }
        }
        
        while (j < n && p.charAt(j) == '*') {
            j++;
        }
        
        return j == n;
    }
}