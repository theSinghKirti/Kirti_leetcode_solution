class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        ranges = []
        i = 0
        n = len(nums)
        
        while i < n:
            start = nums[i]
            
            while i + 1 < n and nums[i] + 1 == nums[i + 1]:
                i += 1
                
            if start != nums[i]:
                ranges.append(f"{start}->{nums[i]}")
            else:
                ranges.append(str(start))
                
            i += 1
            
        return ranges