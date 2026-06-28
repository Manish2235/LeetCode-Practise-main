class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> list = new ArrayList<Integer>();
	int n= nums.length;
	Map<Integer,Integer> map= new HashMap<Integer, Integer>();
	for(int x: nums)
	{
		map.put(x, map.getOrDefault(x, 0)+1);
	}
	for(int i=1; i<=n; i++)
	{
		if(!map.containsKey(i))
		{
			list.add(i);
		}
	}
	return list;
    }
}