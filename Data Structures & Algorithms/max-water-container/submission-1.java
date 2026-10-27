class Solution {
    public int maxArea(int[] heights) {

    int low = 0;
    int high = heights.length - 1;

    int maxHeight = 0;

    while ( low < high ){

    // figure out the calculation for this
    maxHeight = Math.max(maxHeight, (high - low) * Math.min(heights[high], heights[low]));
    // multiplied by the area so l * w multiplied by the min height
    if (heights[low] < heights[high]){
        low++;
    } else {
        high--;
    }

    }

    return maxHeight;
        
    }
}
