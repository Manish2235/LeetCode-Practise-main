class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set= new HashSet<String>();
        for(int i=0; i<9; i++)
        {
        	for(int j=0; j<9; j++)
        	{
        		if(board[i][j]=='.')
        		{
        			continue;
        		}
        		String row=Integer.toString(board[i][j])+"_ROW_"+Integer.toString(i);
        		String col=Integer.toString(board[i][j])+"_COL_"+Integer.toString(j);
        		String box=Integer.toString(board[i][j])+"_BOX_"+Integer.toString(i/3)+Integer.toString(j/3);
        		if(set.contains(row)||set.contains(col)||set.contains(box))
        		{
        			return false;
        		}
        		set.add(row);
        		set.add(col);
        		set.add(box);
        		
        	}
        		
        }
        return true;
    }
}