class Solution {
   static int n;
	static int[][] t= new int [2501][2501];
	
	static int	solve(int [] arr,int i, int p)
{
	if(i>=n)
	{
		return 0;
	}
	if(p!=-1&&t[i][p]!=-1)
	{
		return t[i][p];
	}
	int take=0; 
	if(p==-1|| arr[i]>arr[p])
	{
		take = 1+solve(arr, i+1, i);
	}
	int skip = solve(arr, i+1, p);
	if(p!=-1)
	{
		t[i][p]=Math.max(take,skip);
	}
	
	return Math.max(take,skip);
}
static public int lengthOfLIS(int[] nums) {
         n=nums.length;
         for (int[] row : t) {
     	    Arrays.fill(row, -1);
     	}
        return solve(nums, 0,-1);
    }
}