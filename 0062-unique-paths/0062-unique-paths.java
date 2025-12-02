class Solution {
    public int uniquePaths(int m, int n) {
        long result = 1;
        int totalMoves = m + n - 2; 
        int movesDown = m - 1;    
        for (int i = 1; i <= movesDown; i++) {
            result = result * (totalMoves - movesDown + i) / i;
        }
        
        return (int) result;
    }
}