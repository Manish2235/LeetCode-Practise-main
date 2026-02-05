class Solution {
      int result;
	 public int numTilePossibilities(String tiles) {
	        int[] freq = new int[26];
	        for (char c : tiles.toCharArray()) {
	            freq[c - 'A']++;
	        }
	        backtrack(freq);
	        return result;
	    }
	    private void backtrack(int[] freq) {
	        for (int i = 0; i < 26; i++) {
	            if (freq[i] > 0) {

	                freq[i]--;
	                result++;  

	                backtrack(freq);

	                freq[i]++;
	            }
	        }
	    }

}