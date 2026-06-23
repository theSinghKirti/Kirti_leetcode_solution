class Solution {
    public boolean backspaceCompare(String s, String t) {
        int ps = s.length() - 1;
        int pt = t.length() - 1;

        while (ps >= 0 || pt >= 0) {
            ps = getNextValidCharIndex(s, ps);
            pt = getNextValidCharIndex(t, pt);

            // If one string is exhausted and the other isn't, they aren't equal
            if (ps < 0 && pt < 0) return true;
            if (ps < 0 || pt < 0) return false;
            
            // Compare the characters
            if (s.charAt(ps) != t.charAt(pt)) return false;
            
            ps--;
            pt--;
        }
        return true;
    }

    private int getNextValidCharIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#') {
                backspaceCount++;
            } else if (backspaceCount > 0) {
                backspaceCount--;
            } else {
                break;
            }
            index--;
        }
        return index;
    }
}