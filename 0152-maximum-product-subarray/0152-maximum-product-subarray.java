class Solution {
    public int maxProduct(int[] nums) {
   /* int n = nums.length;
    int max = nums[0];

    for (int i = 0; i < n; i++) {
        int a = 1;

        for (int j = i; j < n; j++) {
            a = a * nums[j];  
            max = Math.max(max, a);
        }
    }

    return max;*/
    int max = nums[0];
	    int min = nums[0];
	    int result = nums[0];
	    for (int i = 1; i < nums.length; i++) {
	        int curr = nums[i];
	        if (curr < 0) {
	            int temp = max;
	            max = min;
	            min = temp;
	        }
	        max = Math.max(curr, max * curr);
	        min = Math.min(curr, min * curr);

	        result = Math.max(result, max);
	    }
	    return result;
    }
}