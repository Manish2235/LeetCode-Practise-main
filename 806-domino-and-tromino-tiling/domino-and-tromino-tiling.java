class Solution {
    public int numTilings(int n) {
         int MOD = 1_000_000_007;

        if (n <= 2) return n;

        long a = 1, b = 2, c = 5;   // dp[1], dp[2], dp[3]

        for (int i = 4; i <= n; i++) {
            long next = (2 * c + a) % MOD;
            a = b;
            b = c;
            c = next;
        }

        return (int) c;
    }
}