class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left < right){
        
        int mid = (left + right) / 2;

        if(nums[mid] == 0){
            return nums[mid];
        }

        if(nums[left] < nums[right] && mid < right){
            right = mid - 1;
        } else {
            left = mid + 1;
        }

        if(left + 1 == right){
            return result = nums[left];
        }
        result = nums[mid];

        }
        return result;
    }
}
