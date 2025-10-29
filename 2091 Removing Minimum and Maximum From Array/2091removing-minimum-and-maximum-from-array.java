class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
	    if (n == 1) return 1;

	    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	    int mini = 0, maxi = 0;

	    for (int i = 0; i < n; i++) {
	        if (nums[i] < min) {
	            min = nums[i];
	            mini = i;
	        }
	        if (nums[i] > max) {
	            max = nums[i];
	            maxi = i;
	        }
	    }

	    int left = Math.max(mini, maxi) + 1;              // remove from front
	    int right = n - Math.min(mini, maxi);             // remove from back
	    int both = Math.min(mini, maxi) + 1 + n - Math.max(mini, maxi); // both ends

	    int result = Math.min(left, Math.min(right, both));

	    
	    return result;
    }
}