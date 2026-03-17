class Solution {
    void backtrack(int[] nums, int idx, List<Integer> temp, List<List<Integer>> result )
	{
		
		result.add(new ArrayList<>(temp));
		  for(int i=idx; i<nums.length; i++)
		  {
             if(i > idx && nums[i] == nums[i - 1]) continue;
			  temp.add(nums[i]);
			  backtrack(nums, i+1, temp, result);
			  temp.remove(temp.size()-1);
		  }
	}

public List<List<Integer>> subsetsWithDup(int[] nums) {
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	Arrays.sort(nums);
	backtrack(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }
}