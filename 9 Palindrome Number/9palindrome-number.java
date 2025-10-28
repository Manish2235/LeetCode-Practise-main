class Solution {
    public boolean isPalindrome(int x) {
    if (String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString()))
    {
        return true;
    }
    else
    {
       return false; 
    }

    }
}