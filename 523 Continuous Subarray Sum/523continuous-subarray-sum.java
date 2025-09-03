class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        	Map<Integer, Integer> map= new HashMap<Integer, Integer>();
    map.put(0, -1);
	int sum=0;
	for(int i=0; i<nums.length; i++)
	{
	
		sum=sum+nums[i];
		if(map.containsKey(sum%k))
		{
            if(i-map.get(sum%k)>=2)
			return true;
		}
		else {
			map.put(sum%k, i);
		}
	}
	
        return false;
    }
}