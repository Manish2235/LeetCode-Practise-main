class Solution {
   	int  [][]dp;
	int solve(int [] prices, int idx, int n,boolean flag,int buy)
	{
		if(idx>=n)
		{
			return 0;
		}
		int profit=0;
		if(dp[idx][buy]!=-1)
		{
			return dp[idx][buy];
		}
		if(flag)
		{
			int take =solve(prices, idx+1, n, false,0)-prices[idx];
			int not_take= solve(prices, idx+1, n, true,1);
			profit=Math.max(take, not_take);
		}
		else
		{
			int sell=solve(prices, idx+2, n, true,1)+prices[idx];
			int not_sell= solve(prices, idx+1, n, false,0)	;	
			profit=Math.max(sell, not_sell);
		}
		return dp[idx][buy]=profit;
	}
public int maxProfit(int[] prices) {
        int n= prices.length;
        dp=  new int[n][2];
        for(int  [] a:dp)
        {
        	Arrays.fill(a,-1);
        }
        return solve(prices, 0, n, true,1);
    }
}