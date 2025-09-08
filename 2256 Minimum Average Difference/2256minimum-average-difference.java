class Solution {
    public int minimumAverageDifference(int[] nums) {
       int n = nums.length;
        int c = -1;
        long min = Long.MAX_VALUE;
        long sum = Arrays.stream(nums).asLongStream().sum();
        long ls = 0;
        for (int i = 0; i < n; i++) {
            ls += nums[i];
            long rs = sum - ls;
            int l = i + 1;
            int r = n - l;
            long leftAvg = ls / l;
            long rightAvg = (r == 0) ? 0 : rs / r;
            long diff = Math.abs(leftAvg - rightAvg);
            if (diff < min) {
                min = diff;
                c = i;
            }
        }

        return c;
    }
}