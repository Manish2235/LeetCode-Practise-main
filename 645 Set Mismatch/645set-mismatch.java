class Solution {
    public int[] findErrorNums(int[] nums) {
       List<Integer> list= new ArrayList<Integer>();
	Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	int max=Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++)
        {
        	if(max<nums[i])
        	{
        		max=nums[i];
        	}
        	if(map.containsKey(nums[i]))
        		list.add(nums[i]);
        	else
        		map.put(nums[i], i);
        }
        for(int i=1; i<nums.length+1; i++)
        {
        	if(!map.containsKey(i))
        	{
        		list.add(i);
        	}
        }
        return list.stream()
                .mapToInt(Integer::intValue) 
                .toArray(); 
    }
}