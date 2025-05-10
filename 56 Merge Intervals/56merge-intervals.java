class Solution {
 public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] merged = new int[intervals.length][2];
        int c = 0;
        merged[c] = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (merged[c][1] >= intervals[i][0]) {
                merged[c][1] = Math.max(merged[c][1], intervals[i][1]);
            } else {
                c++;
                merged[c] = intervals[i];
            }
        }
        return Arrays.copyOf(merged, c + 1);
    }
}