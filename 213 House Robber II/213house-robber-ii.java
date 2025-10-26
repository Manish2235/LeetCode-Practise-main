class Solution {
int[] t= new int[101];
	int solve(int[] nums, int i,int n)
	{
		if(i>n)
		{
			return 0;
		}
		if(t[i]!=-1)
		{
			return t[i];
		}
		int take =nums[i]+solve(nums, i+2, n);
		int skip =solve(nums, i+1, n);
		t[i]=Math.max(take, skip);
				
		return t[i];
	}
	public int rob(int[] nums) {
		int n=nums.length;
		if(n==1)
		{
			return nums[0];
		}
		if(n==2)
		{
			return Math.max(nums[0], nums[1]);
		}
		
		for(int i=0; i<101; i++)
		{
			t[i]=-1;
		}
		int _0th = solve(nums, 0,n-2);
		for(int i=0; i<101; i++)
		{
			t[i]=-1;
		}
		int _1th = solve(nums, 1, n-1);
		return Math.max(_0th, _1th);
	    }
}