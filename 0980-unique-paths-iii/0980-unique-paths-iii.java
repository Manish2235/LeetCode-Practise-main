class Solution {
   int m;
	int n;
	int result;
	int nonobstacle ;
	int [][] directions= {{1,0},{-1,0},{0,1},{0,-1}};
	void bactrack(int[][] grid, int count, int i , int j)
	{
		if(i<0|| i>=m||j>=n||j<0|| grid[i][j]==-1)
		{
			return ;
		}
		if(grid[i][j]==2)
		{
			if(count== nonobstacle)
				result++;
			return;
		}
		grid[i][j]=-1;
		for(int[] dir:directions)
		{
			int new_i=i+dir[0];
			int new_j=j+dir[1];
			bactrack(grid, count+1, new_i, new_j);
		}
        grid[i][j]=0;
	}
public int uniquePathsIII(int[][] grid) {
	m=grid.length;
	n=grid[0].length;
	result=0; 
	nonobstacle =0;
	int start_x=0,start_y=0;
	for(int i=0; i<m; i++)
	{
		for(int j=0; j<n; j++)
		{
			if(grid[i][j]==0)
			{
				nonobstacle++;
			}
			if(grid[i][j]==1)
			{
				start_x=i;
				start_y=j;
			}
		}
	}
	nonobstacle+=1;
	int count=0;
	bactrack(grid, count,start_x,start_y);
	return result;
        
    }
}