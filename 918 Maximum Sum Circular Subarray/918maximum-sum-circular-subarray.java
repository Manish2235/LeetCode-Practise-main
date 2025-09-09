class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int SUM = 0;
        for (int num : nums) {
            SUM += num;
        }
        
        int k_sum_min = nums[0];
        int min_sum = nums[0];
        
        int k_sum_max = nums[0];
        int max_sum = nums[0];
        
        for (int i = 1; i < n; i++) {
            min_sum = Math.min(nums[i] + min_sum, nums[i]);
            k_sum_min = Math.min(k_sum_min, min_sum);
            
            max_sum = Math.max(nums[i] + max_sum, nums[i]);
            k_sum_max = Math.max(k_sum_max, max_sum);
        }
        
        int circular_sum = SUM - k_sum_min;
        
        if (k_sum_max > 0) {
            return Math.max(k_sum_max, circular_sum);
        }
        
        return k_sum_max;
    }
}