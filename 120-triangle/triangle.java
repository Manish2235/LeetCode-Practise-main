class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      /*  int n= triangle.size();
	int min_sum=0;
	for(int i=0; i<n; i++)
	{
		Integer minValue = Collections.min(triangle.get(i));
		min_sum+=minValue;
	}
	return min_sum;*/
    int n = triangle.size();
    int[] dp = new int[n];
    for (int i = 0; i < n; i++) {
        dp[i] = triangle.get(n - 1).get(i);
    }
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
        }
    }
    return dp[0];
    }
}