class Solution {
    public int[] maxValue(int[] nums) {
        int n=nums.length;
	int[]max_pre=new int[n];
	int[]min_suf=new int[n];
	int max=0;
	for(int i=0; i<n; i++)
	{
		max=Math.max(max, nums[i]);
		max_pre[i]=max;
	}
	int min=Integer.MAX_VALUE;
	for(int i=n-1; i>=0; i--)
	{
		min=Math.min(min, nums[i]);
		min_suf[i]=min;
	}
	int[] result =new int [n] ;
	for(int i=n-1; i>=0; i--)
	{
		result[i]=max_pre[i];
		if(i+1<n&& max_pre[i]>min_suf[i+1])
		{
			result[i]=result[i+1];
		}
	}
	return result;    
    }
}