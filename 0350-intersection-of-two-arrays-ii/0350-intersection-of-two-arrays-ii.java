class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
	            return intersect(nums2, nums1);
	        }
	        
	        HashMap<Integer, Integer> freqMap = new HashMap<>();
	        for (int num : nums1) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }
	
	        List<Integer> result = new ArrayList<>();
	        for (int num : nums2) {
	            if (freqMap.containsKey(num) && freqMap.get(num) > 0) {
	                result.add(num);
	                freqMap.put(num, freqMap.get(num) - 1);
	            }
	        }
	       
	        int[] resultArray = new int[result.size()];
	        for (int i = 0; i < result.size(); i++) {
	            resultArray[i] = result.get(i);
	        }
	        return resultArray;
    }
}