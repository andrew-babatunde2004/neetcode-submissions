class Solution {
    public int maxArea(int[] heights) {

    int low = 0;
    int high = heights.length - 1;

    int maxHeight = 0;

    while ( low < high ){

     maxHeight = Math.max(maxHeight, (high - low) * Math.min(heights[high], heights[low]));
    
    if (heights[low] < heights[high]){
        low++;
    } else {
        high--;
    }

    }

    return maxHeight;
        
    }
}
