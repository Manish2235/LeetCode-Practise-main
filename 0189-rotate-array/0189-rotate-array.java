class Solution {
   public static void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums, 0, n-1);
        reverse(nums, k, n-1);
        int []arr=reverse(nums, 0, k-1);
        for(int x:arr )
        {
        	System.out.print(x);
        }
             
}
static int[] reverse(int[]nums ,int left,int right )
{
	while(left<right)
	{ 
		int temp=nums[left];
		nums[left]=nums[right];
		nums[right]=temp;
		left++;
		right--;
	}
	
	return nums;	
}
}