class Solution {
int[][] dp;
	int m, n;
	int solve(String s1, String s2, int i , int j)
	{
		if(i>=m || j>=n)
		{
			return 0;
		}
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		if(s1.charAt(i)==s2.charAt(j))
		{
			return 1+solve(s1, s2, i+1, j+1);
		}
		else return dp[i][j]= Math.max(solve(s1, s2, i+1, j),solve(s1, s2, i, j+1) );
	}
public int longestCommonSubsequence(String text1, String text2) {
	  m=text1.length();
	  n= text2.length();
        dp= new int[m][n];
        
        for(int i=0; i<m; i++)
        {
        	Arrays.fill(dp[i], -1);
        }
        return solve(text1, text2, 0, 0);
    }
}