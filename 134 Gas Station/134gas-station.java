class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
    int current = 0;
    int start = 0;

    for (int i = 0; i < gas.length; i++) {
        int gain = gas[i] - cost[i];
        total += gain;
        current += gain;

        if (current < 0) {
       
            start = i + 1;
            current = 0;
        }
    }

    return total >= 0 ? start : -1; 
    }
}