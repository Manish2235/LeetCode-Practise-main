class Solution {
   int maxsum = 0;
    int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    int m, n;

    void backtrack(int i, int j, int currSum, int[][] grid) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) return;

        int gold = grid[i][j];
        currSum += gold;

        maxsum = Math.max(maxsum, currSum);

        grid[i][j] = 0;

        for (int[] dir : direction) {
            backtrack(i + dir[0], j + dir[1], currSum, grid);
        }
        grid[i][j] = gold;
    }

    public int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    backtrack(i, j, 0, grid);
                }
            }
        }
        return maxsum;
    }
}