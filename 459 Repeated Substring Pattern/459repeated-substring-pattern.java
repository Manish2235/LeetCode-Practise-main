class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
	    for(int i=n/2; i>=1; i--)
	    {
	    	if(n%i==0)
	    	{
	    		int time=n/i;

		    	String pattern= s.substring(0, i);
		    	String newstr="";
		    	while(time-->0)
		    	{
		    		newstr+=pattern;
		    	}
		    	if(s.equals(newstr))
		    	return true;
	    	}
	    }
	   return false;
    }
}