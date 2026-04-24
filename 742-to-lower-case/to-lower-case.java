class Solution {
    public String toLowerCase(String s) {
         StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append(Character.toLowerCase(c));
        }
        
        return result.toString();
    }
}