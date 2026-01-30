class Solution {
    int max=Integer.MAX_VALUE;
	void backtrack(int idx, int[] nums, int [] childrens, int k)
	{
		if(idx==nums.length)
		{
			 int unfairness = 0;
	            for (int sum : childrens) unfairness = Math.max(unfairness, sum);
	            max = Math.min(max, unfairness);
			return ;
		}
		 int currMax = 0;
	        for (int sum : childrens) currMax = Math.max(currMax, sum);
	        if (currMax >= max) return;
	        for (int i = 0; i < k; i++) {
	            
	            if (i > 0 && childrens[i] == childrens[i - 1]) continue;

	            childrens[i] += nums[idx];
	            backtrack( idx + 1,nums,  childrens, k);
	            childrens[i] -= nums[idx];


	            if (childrens[i] == 0) break;
	        }

		
	}
public int distributeCookies(int[] cookies, int k) {
	int [] childres = new int [k];
	backtrack(0, cookies, childres, k);
        return max;
    }

}