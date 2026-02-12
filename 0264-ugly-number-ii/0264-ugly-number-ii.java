class Solution {
   public int nthUglyNumber(int n) {
       int [] dp=new int[n+1];
       int i2=1;
        int i3=1;
        int i5=1;
        dp[1]=1;
        for(int i=2;i<=n; i++ )
        {
        	int i2un=dp[i2]*2;
        	int i3un=dp[i3]*3;
        	int i5un=dp[i5]*5;
        	int minun=Math.min(i2un,Math.min(i3un, i5un));
        	dp[i]=minun;
        	if(minun==i2un)
        	{
        		i2++;
        	}
        	if(minun==i3un)
        	{
        		i3++;
        	}
        	if(minun==i5un)
        	{
        		i5++;
        	}
        }
       return dp[n];
    }
}