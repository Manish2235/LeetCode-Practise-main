class Solution {
    public int lengthOfLIS(int[] nums) {
        int n= nums.length;
        int[] t= new int[n];
        int maxLIS=1;
        Arrays.fill(t,1);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                if(nums[j]<nums[i])
                {
                    t[i]=Math.max(t[i],t[j]+1);
                    maxLIS=Math.max(maxLIS,t[i]);
                }
            }
        }
        return maxLIS;
    }
}