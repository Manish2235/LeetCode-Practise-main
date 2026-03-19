class Solution {
    public int maxProduct(int[] nums) {
    int n = nums.length;
    int max = nums[0];

    for (int i = 0; i < n; i++) {
        int a = 1;

        for (int j = i; j < n; j++) {
            a = a * nums[j];  
            max = Math.max(max, a);
        }
    }

    return max;
    }
}