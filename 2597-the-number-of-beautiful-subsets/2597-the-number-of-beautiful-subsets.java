class Solution {
   int k;
    int[] values;         
    int[] count;           
    Integer[] dp;          
    public int beautifulSubsets(int[] nums, int k) {
        this.k = k;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);
        int m = map.size();
        values = new int[m];
        count = new int[m];
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            values[idx] = e.getKey();
            count[idx] = e.getValue();
            idx++;
        }
        dp = new Integer[m];
        int ans = dfs(0, new HashSet<>());
        return ans - 1;
    }
    private int dfs(int i, Set<Integer> chosen) {
        if (i == values.length) return 1;
        if (dp[i] != null && chosen.isEmpty()) return dp[i];

        int v = values[i];
        int ways = 0;
        ways += dfs(i + 1, chosen);
        if (!chosen.contains(v - k)) {
            chosen.add(v);
            int pickWays = (1 << count[i]) - 1; 
            ways += pickWays * dfs(i + 1, chosen);
            chosen.remove(v);
        }
        if (chosen.isEmpty()) dp[i] = ways;
        return ways;
    }
}