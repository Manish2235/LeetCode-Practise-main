class Solution {
    public int[] findBall(int[][] grid) {
        int m=grid.length;
		 int n=grid[0].length;
		 int [] result=new int[n];
		 for(int ball=0; ball<grid[0].length; ball++)
		 {
			 int row=0;
			 int call=ball;
			 boolean flag =false;
			 while(row<m&&call<n)
			 {
				 if(grid[row][call]==1)
				 {
					 if(call==n-1||grid[row][call+1]==-1)
					 {
						 flag =true;
						 break;
					 }
					call++; 
				 }
				 else {
					 if(call==0||grid[row][call-1]==1 )
					 {
						 flag=true;
						 break;
					 }
					 call--;
				 }
				 row++;
			 }
			 if(flag==true)
			 {
				 result[ball]=-1;
			 }
			 else
			 {
				 result[ball]=call;
			 }
		 }
	     return result;   
    }
}