class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        // Return the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}