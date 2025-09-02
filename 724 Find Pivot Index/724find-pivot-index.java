class Solution {
   public  int sum(int i, int j, int[] arr)
	{
		int sum=0;
		for(int a =i; a<j; a++)
		{
			sum=sum+arr[a];
		}
		return sum;
	}
	 public  int pivotIndex(int[] nums) {
		 int i=0;
	        for( i=0; i<nums.length; i++)
	        {
	        	if(sum(0,i,nums)==sum(i+1,nums.length,nums))
	        	{
	        		return i;
	        	}
	        }
	        return -1;
	    }
}