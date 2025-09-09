class Solution {
  public static int binarySearch(int[] nums, int n, int x) {
	    int l = 0, r = n - 1;
	    int mid;
	    int resultidx = -1;
	    while (l <= r) {
	        mid = l + (r - l) / 2;
	        if (nums[mid] <= x) {
	            resultidx = mid;
	            l = mid + 1;
	        } else {
	            r = mid - 1;
	        }
	    }
	    return resultidx + 1; 
	}

	public static int[] answerQueries(int[] nums, int[] queries) {
	    Arrays.sort(nums);

	    for (int i = 1; i < nums.length; i++) {
	        nums[i] += nums[i - 1];
	    }

	    int[] result = new int[queries.length];
	    int c = 0;
	    for (int x : queries) {
	        int count = binarySearch(nums, nums.length, x);
	        result[c++] = count;
	    }
	    return result;
	}
}