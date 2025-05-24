class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n = nums.length;
     double sum = 0;
     for (int i = 0; i < k; i++) {
         sum += nums[i];
     }

     double maxSum = sum;
     for (int i = k; i < n; i++) {
         sum = sum - nums[i - k] + nums[i];
         maxSum = Math.max(maxSum, sum);
     }
     return maxSum / k;
}
}