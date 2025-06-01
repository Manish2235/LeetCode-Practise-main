class Solution {
    public int largestAltitude(int[] gain) {
         int n=gain.length;
		 int current=0;
		 int max=0; 
		 for(int i=0; i<n; i++)
		 {
			 current=current+gain[i];
			 max=Math.max(max, current);
		 }
		return max;
    }
}