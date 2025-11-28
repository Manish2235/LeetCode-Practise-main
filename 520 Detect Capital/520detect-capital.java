class Solution {
    public boolean detectCapitalUse(String word) {
        int n= word.length();
	       int count=0;
	       for(int i=0; i<n; i++)
	       {
	    	   if(word.charAt(i)<=90 && word.charAt(i)>=65)
	    	   {
	    		   count++;
	    	   }
	       }
	       if(count==n)
	       {
	    	   return true;
	       }
	       if(count==1 &&( word.charAt(0)>=65&&word.charAt(0)<=90))
	    		   {
	    	   return true;
	    		   }
	       if(count==0)
	       {
	    	   return true;
	       }
	       return false;
    }
}