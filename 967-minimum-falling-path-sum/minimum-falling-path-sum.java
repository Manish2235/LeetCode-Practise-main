class Solution {
int n;
	    int[][] dp;

	    int solve(int[][] m, int r, int c) {
	        if (r == n - 1) return m[r][c];

	        if (dp[r][c] != Integer.MAX_VALUE)
	            return dp[r][c];

	        int best = Integer.MAX_VALUE;

	        for (int d = -1; d <= 1; d++) {
	            int nc = c + d;
	            if (nc >= 0 && nc < n) {
	                best = Math.min(best, m[r][c] + solve(m, r + 1, nc));
	            }
	        }

	        return dp[r][c] = best;
	    }

	    public int minFallingPathSum(int[][] matrix) {
	        n = matrix.length;
	        dp = new int[n][n];

	        for (int i = 0; i < n; i++)
	            Arrays.fill(dp[i], Integer.MAX_VALUE);

	        int ans = Integer.MAX_VALUE;

	        for (int c = 0; c < n; c++)
	            ans = Math.min(ans, solve(matrix, 0, c));

	        return ans;
	    }
}