class Solution {
        
 	 int ans = 0;
	    public int maxUniqueSplit(String s) {
	        HashSet<String> set = new HashSet<>();
	        backtrack(s, 0, set);
	        return ans;
	    }
	    private void backtrack(String s, int index, HashSet<String> set) {
	        if (index == s.length()) {
	            ans = Math.max(ans, set.size());
	            return;
	        }
	        if (set.size() + (s.length() - index) <= ans) return;
	        for (int end = index + 1; end <= s.length(); end++) {
	            String sub = s.substring(index, end);
	            if (!set.contains(sub)) {
	                set.add(sub);
	                backtrack(s, end, set);
	                set.remove(sub); 
	            }
	        }
	    }
}