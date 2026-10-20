class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    Set<List<Integer>> res = new HashSet<>();
    // sorts the given array, which is a thing I guess tried to call that earlier during 
    // NCR didint fucking work
    Arrays.sort(nums);


    for(int i = 0; i < nums.length - 2; i++){
    // something about skipping duplicate values 

    // if we set left = to i we'd be duplicating
    int left = i + 1;
    // checking the rest of the array
    int right = nums.length - 1;

    while (left < right){

    int sum = nums[i] + nums[left] + nums[right];

    if(sum == 0){
        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
        left++;
        right--;
    } else if (sum > 0){
        right--;
    } else {
        left++;
    }



    }
    

    }


    



return new ArrayList<>(res);



    }
}
