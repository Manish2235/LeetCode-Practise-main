class Solution {
  public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    private static void backtrack(List<String> result, String current, int openCount, int closeCount, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (openCount < max) {
            backtrack(result, current + "(", openCount + 1, closeCount, max);
        }
        if (closeCount < openCount) {
            backtrack(result, current + ")", openCount, closeCount + 1, max);
        }
    }

}