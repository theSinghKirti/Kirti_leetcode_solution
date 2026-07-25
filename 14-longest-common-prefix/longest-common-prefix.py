class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        
        # Find the lexicographically smallest and largest strings
        s1 = min(strs)
        s2 = max(strs)
        
        # Compare characters of the smallest and largest strings
        for i, char in enumerate(s1):
            if char != s2[i]:
                return s1[:i] # Return the prefix up to the mismatch
                
        return s1 # If we finish the loop, the entire smallest string is the prefix