class Solution {
    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            // Update ones
            ones = (ones ^ num) & ~twos;

            // Update twos
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}