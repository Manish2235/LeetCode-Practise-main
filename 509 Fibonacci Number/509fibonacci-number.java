class Solution {
   public int solve(int n, List<Integer> list) {
        if (n <= 1) {
            return n;
        }
        if (list.size() > n && list.get(n) != -1) {
            return list.get(n);
        }
        int result = solve(n - 1, list) + solve(n - 2, list);
      
        list.set(n, result);
        return result;
    }

    public int fib(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(-1);
        }
        return solve(n, list);
    }
}