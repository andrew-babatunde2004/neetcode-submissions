class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # set command only returns unique elemements
        return len(set(nums)) < len(nums)