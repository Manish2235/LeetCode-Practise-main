class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
	    s=s.toLowerCase();
        StringBuilder st= new StringBuilder();
        st.append(s);
        return st.reverse().toString().equals(s);
    }
}