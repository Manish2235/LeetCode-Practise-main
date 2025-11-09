class Solution {
   static public void swap(int[] arr, int i, int j)
	{
	int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
	}
 static public void backtrack(int[] candidates,  int start,  List<List<Integer>> result)
 {
	 if (start == candidates.length) {
         List<Integer> permutation = new ArrayList<>();
         for (int num : candidates) permutation.add(num);
         result.add(permutation);
         return;
     }

	 for (int i = start; i < candidates.length; i++) {
         swap(candidates, i, start);                // choose
         backtrack(candidates, start + 1, result);  // explore
         swap(candidates, i, start);                // undo (backtrack)
     }
 }
public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Integer[] list= new Integer[nums.length];
        for(int i=0; i<nums.length; i++)
        {
        	list[i]=nums[i];
        }
        backtrack(nums,  0,  result);
        return result;
    }
}