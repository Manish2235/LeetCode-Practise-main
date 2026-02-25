class Solution {
    public int mincostTickets(int[] days, int[] costs) {
         int n = days.length;
        int[] dp = new int[n + 1];
        
        for (int i = n - 1; i >= 0; i--) {
            int cost1 = costs[0] + dp[i + 1];
            int j = i;
            while (j < n && days[j] < days[i] + 7) j++;
            int cost7 = costs[1] + dp[j];
         
            j = i;
            while (j < n && days[j] < days[i] + 30) j++;
            int cost30 = costs[2] + dp[j];
            
            dp[i] = Math.min(cost1, Math.min(cost7, cost30));
        }
        
        return dp[0];
    }
}