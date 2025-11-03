class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
    int sum = 0, f = 0;

    
    for (int i = 0; i < n; i++) {
        sum += nums[i];
        f += i * nums[i];
    }

    int max = f;

    for (int k = 1; k < n; k++) {
        f = f + sum - n * nums[n - k];
        max = Math.max(max, f);
    }

    return max;
    }
}