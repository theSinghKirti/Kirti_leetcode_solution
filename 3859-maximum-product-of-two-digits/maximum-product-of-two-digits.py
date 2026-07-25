class Solution:
    def maxProduct(self, n: int) -> int:
        # Convert the number to a string and sort it in descending order
        digits = sorted(str(n), reverse=True)
        
        # Multiply the two largest digits (the first two in the sorted list)
        return int(digits[0]) * int(digits[1])