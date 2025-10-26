class Solution {
   int n;
	    Long[][] dp;
	    
	    long solve(int idx, int[] nums, boolean flag) {
	        if (idx >= n) return 0;
	        int f = flag ? 1 : 0;
	        if (dp[idx][f] != null) return dp[idx][f];

	        long skip = solve(idx + 1, nums, flag);
	        long val = flag ? nums[idx] : -nums[idx];
	        long take = solve(idx + 1, nums, !flag) + val;
	        
	        return dp[idx][f] = Math.max(skip, take);
	    }

	    public long maxAlternatingSum(int[] nums) {
	        n = nums.length;
	        dp = new Long[n][2];
	        return solve(0, nums, true);
	    }
}