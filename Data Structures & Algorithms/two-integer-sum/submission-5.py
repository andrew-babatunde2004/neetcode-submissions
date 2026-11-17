class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #creates the hashmap

        seen = {}


        for i, num in enumerate(nums):
        
            diff = target - num
            # if diff is within the hashmap
            if diff in seen:
                # return the array with what was in the hashmap and the current number
                return [seen[diff], i]
            # if not the hashmap key is = num with the value being equal to i
            seen[num] = i

        # if not found return and empty array
        return []
            
        