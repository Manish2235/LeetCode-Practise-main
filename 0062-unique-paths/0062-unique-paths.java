class Solution {
    public int uniquePaths(int m, int n) {
        long result = 1;
        int totalMoves = m + n - 2; // total steps robot must take
        int movesDown = m - 1;     // choose positions for downward moves
        
        // We will compute C(totalMoves, movesDown)
        for (int i = 1; i <= movesDown; i++) {
            result = result * (totalMoves - movesDown + i) / i;
        }
        
        return (int) result;
    }
}