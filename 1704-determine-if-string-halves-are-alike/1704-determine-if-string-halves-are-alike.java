class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int m=n/2;
        int left=0, right=0;
        int i=0, j=m;
        String vowels="aeiouAIUOE";
        while(i<m && j<n)
        {
            if (vowels.indexOf(s.charAt(i)) != -1) left++;
            if (vowels.indexOf(s.charAt(j)) != -1) right++;

            i++;
            j++;
        }
        return left==right;

    }
}