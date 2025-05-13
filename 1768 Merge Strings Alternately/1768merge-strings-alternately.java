class Solution {
    public String mergeAlternately(String word1, String word2) {
        		StringBuilder s= new StringBuilder();
		int c= word1.length()>word2.length()?word2.length():word1.length();
		int i=0;
		while(i<c)
		{
			s.append(word1.charAt(i));
			s.append(word2.charAt(i));
			i++;
		}
		if(word1.length()>word2.length())
		{
			while(i<word1.length())
			{
				s.append(word1.charAt(i));
				i++;
			}
		}
		else
		{
			while(i<word2.length())
			{
				s.append(word2.charAt(i));
				i++;
			}
		}
		return s.toString();
    }
}