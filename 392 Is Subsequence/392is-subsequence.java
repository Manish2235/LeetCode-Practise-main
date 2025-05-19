class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty())
	{
		return true;
	}
    boolean a=false;
	int c=0;
	for(int i=0; i<t.length()&&c<s.length(); i++) {
		
		if(s.charAt(c)==t.charAt(i))
		{
			a=true;
			c++;
		}
	}
	if(c==s.length() && a==true)
	{
		return true;
	}
	else {
	return false;
	}
    }
}