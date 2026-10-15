class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = 0;

        while (left < right){

        int mid = (left + right) / 2;

        // how do I handle the edge cases when the pointer 
        // is the lowest value in the array

        if(nums[mid] < nums[right]){
            // how do I make this inclusive
            right = mid;
        } else {
            // for both sides
            left = mid + 1;
        }

        

        }
        return Math.min(nums[left],nums[right]); // return the converged answer?
    }
}