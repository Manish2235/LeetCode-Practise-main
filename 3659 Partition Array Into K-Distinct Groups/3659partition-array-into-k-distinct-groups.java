class Solution {
    public boolean partitionArray(int[] nums, int k) {

        if (nums.length % k != 0) return false;
		 Map<Integer, Integer> map = new HashMap<>();
		    for (int num : nums) {
		        map.put(num, map.getOrDefault(num, 0) + 1);
		    }
		    for (int count : map.values()) {
		        if (count >nums.length/k) {
		            return false;
		        }
		    }
		    return true;
    }
}