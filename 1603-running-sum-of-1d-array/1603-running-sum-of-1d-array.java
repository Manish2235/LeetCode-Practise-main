class Solution {
    public int[] runningSum(int[] nums) {
       int n=nums.length;
	for (int i=0; i<n-1; i++)
	{
		nums[i+1]=nums[i]+nums[i+1];
	}
	return nums;  
    }
}