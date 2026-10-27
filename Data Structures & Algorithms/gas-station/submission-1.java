class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

    int total = 0;
    int resultIndex = 0;

    int totalGas = 0;
    int totalCost = 0;

     for (int i = 0; i < gas.length; i++) {
        totalGas += gas[i];
        totalCost += cost[i];
    }
        
    if(totalGas < totalCost){
        return -1;
    }

    for(int i = 0; i < gas.length; i ++){

    total += gas[i] - cost[i];

    if (total < 0){
        resultIndex = i + 1;
        total = 0;
    }


    }

       return resultIndex;
    }
}
