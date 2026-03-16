class Solution {
    void	backtrack(int [] nums,int idx, List<Integer>temp, List<List<Integer>> result)
  {
	  result.add(new ArrayList<>(temp));
	  for(int i=idx; i<nums.length; i++)
	  {
		  temp.add(nums[i]);
		  backtrack(nums, i+1, temp, result);
		  temp.remove(temp.size()-1);
	  }
  }
public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        backtrack(nums, 0, new ArrayList<>(), list);
        return list;
    }
}