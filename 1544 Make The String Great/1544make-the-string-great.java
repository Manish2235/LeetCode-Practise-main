class Solution {
    public String makeGood(String s) {
      StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && Math.abs(stack.charAt(len - 1) - ch) == 32) {
                // ASCII difference between uppercase and lowercase of same letter is 32
                stack.deleteCharAt(len - 1); // Remove the bad pair
            } else {
                stack.append(ch);
            }
        }

return stack.toString();  
    }
}