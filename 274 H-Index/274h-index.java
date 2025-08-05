class Solution {
    public int hIndex(int[] citations) {
      
		
		Arrays.sort(citations);
	        int n = citations.length;
	        int h = 0;

	        for (int i = 0; i < n; i++) {
	            int papersWithAtLeastThisCitations = n - i;
	            if (citations[i] >= papersWithAtLeastThisCitations) {
	                h = papersWithAtLeastThisCitations;
	                break;
	            }
	        }
	        return h;	  
    }
}