class Solution {
    public boolean checkIfPangram(String sentence) {
       boolean[] seen = new boolean[26];
        
        for (char c : sentence.toCharArray()) {
            // Mark the corresponding index for each letter
            seen[c - 'a'] = true;
        }
        
        // Check if all letters have been seen
        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        
        return true; 
    }
}