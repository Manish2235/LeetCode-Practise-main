class Solution {
    public int countOverlap(int[][] img1,int[][]img2, int row, int col)
	{
		int n=img1.length;
		int count =0; 
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				int b_i=i+row;
				int b_j=j+col;
				if(b_i<0||b_i>=n||b_j<0||b_j>=n) {
					continue;
				}
				if(img1[i][j]==1 &&img2[b_i][b_j]==1)
				{
					count++;
				}
			}
		}
		return count;
	}
	 public int largestOverlap(int[][] img1, int[][] img2) {
		 int n=img1.length;
		 int maxoverlap=Integer.MIN_VALUE;
	        for(int row=-n+1; row<n; row++)
	        {
	        	for(int col=-n+1; col<n; col++)
	        	{
	        		int count = countOverlap(img1,img2,row,col);
	        		maxoverlap=Math.max(maxoverlap, count);
	        	}
	        }
	        return maxoverlap;
	    }
}