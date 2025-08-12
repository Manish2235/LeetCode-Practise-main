class Solution {
    public static int arrMultiply(int[] nums)
{
	int result=1;
	for(int i=0; i<nums.length; i++)
	{
		result = result * nums[i];
	}
	return result;
}
public static int arrMultiply(int k ,int j,int[] nums)
{
	int result=1;

	for(int i=0; i<=k; i++)
	{
		result = result * nums[i];
	}
	for(int i=j; i<nums.length; i++)
	{
		result = result * nums[i];
	}
	return result;
}
    public int[] productExceptSelf(int[] nums) {
        int[] arr= new int[nums.length];
	int result=arrMultiply( nums);
	for(int i=0; i<nums.length; i++)
	{
		if(Double.isNaN(result/(double)nums[i]))
		{
			int d=i;
			int re=arrMultiply(--d,d+2, nums);
			arr[i]=re;
		}
		else {
		arr[i]=result/nums[i];
		}
		
	}
	return arr;
    }
}