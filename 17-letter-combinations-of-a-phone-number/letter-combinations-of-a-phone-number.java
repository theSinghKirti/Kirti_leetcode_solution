class Solution {
    private List<String> result = new ArrayList<>();
    private Map<Character, String> digitToLetters = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        backtrack(digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder path) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }
        
        String letters = digitToLetters.get(digits.charAt(index));
        
        for (char letter : letters.toCharArray()) {
            path.append(letter);
            backtrack(digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}