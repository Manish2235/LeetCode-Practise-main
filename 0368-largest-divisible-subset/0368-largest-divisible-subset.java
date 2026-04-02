class Solution {
   public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];       // dp[i] = size of subset ending at i
        int[] parent = new int[n];   // to track path

        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        int maxLen = 1;
        int lastIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // Reconstruct subset
        List<Integer> result = new ArrayList<>();
        while (lastIndex != -1) {
            result.add(nums[lastIndex]);
            lastIndex = parent[lastIndex];
        }

        Collections.reverse(result);
        return result;
    }

}