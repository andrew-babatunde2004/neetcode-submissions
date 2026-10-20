class Solution {
    public int findMin(int[] nums) {
    
    int l = 0;
    int r = nums.length - 1;
    int mid = 0;
    
    while(l < r){
    
    mid = l + (r - l) / 2;

    if(l < r)

    if(nums[mid] < nums[r]){
        r = mid;
    } else {
        l = mid + 1;
    }



    }

    return Math.min(nums[l], nums[r]);
        
    }

    
}
