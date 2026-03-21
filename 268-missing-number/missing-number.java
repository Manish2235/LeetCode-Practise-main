class Solution {
    public int missingNumber(int[] nums) {
       int actual_sum= 0;
       int complete_sum=0; 
       int max=Integer.MIN_VALUE;
       for(int i=0; i<nums.length; i++)
       {
        actual_sum+=nums[i];
        
       }
       for(int i=0; i<nums.length+1; i++)
       {
        complete_sum+=i;
       }
       return complete_sum-actual_sum;
        
    }
}