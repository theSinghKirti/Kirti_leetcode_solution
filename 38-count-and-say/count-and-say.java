class Solution {
    public String countAndSay(int n) {
        String val = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder nextVal = new StringBuilder();
            int count = 1;
            for (int j = 1; j < val.length(); j++) {
                if (val.charAt(j) == val.charAt(j - 1)) {
                    count++;
                } else {
                    nextVal.append(count).append(val.charAt(j - 1));
                    count = 1;
                }
            }
            nextVal.append(count).append(val.charAt(val.length() - 1));
            val = nextVal.toString();
        }
        return val;
    }
}