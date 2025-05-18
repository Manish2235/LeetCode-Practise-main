class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0,temp;
		 for(i=0;i<nums.length;i++)
		    {
		        if(nums[i]!=0 && nums[j]==0)
		            {
		             temp=nums[i];
		             nums[i]=nums[j];
		             nums[j]=temp;
		            }
		        if(nums[j]!=0)
		            j+=1;
		    }
	      System.out.println(Arrays.toString(nums));
    }
}