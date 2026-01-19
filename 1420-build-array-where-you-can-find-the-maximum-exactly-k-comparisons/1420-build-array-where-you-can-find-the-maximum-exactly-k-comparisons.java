class Solution {
 int n, m, k;
	    int mod = (int)1e9 + 7;
	    Integer[][][] dp;

	    public int solve(int idx, int searchcost, int max) {
	        if (searchcost > k) return 0;

	        if (idx == n) {
	            return searchcost == k ? 1 : 0;
	        }

	        if (dp[idx][searchcost][max] != null)
	            return dp[idx][searchcost][max];

	        int result = 0;

	        for (int i = 1; i <= m; i++) {
	            if (i > max) {
	                result = (result + solve(idx + 1, searchcost + 1, i)) % mod;
	            } else {
	                result = (result + solve(idx + 1, searchcost, max)) % mod;
	            }
	        }

	        return dp[idx][searchcost][max] = result;
	    }

	    public int numOfArrays(int n, int m, int k) {
	        this.n = n;
	        this.m = m;
	        this.k = k;
	        dp = new Integer[n][k + 1][m + 1];
	        return solve(0, 0, 0);
	    }
}