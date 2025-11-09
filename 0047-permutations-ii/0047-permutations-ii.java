class Solution {



 static public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static public void backtrack(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) permutation.add(num);
            result.add(permutation);
            return;
        }

        Set<Integer> used = new HashSet<>(); 
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue; 
            used.add(nums[i]);

            swap(nums, i, start);
            backtrack(nums, start + 1, result);
            swap(nums, i, start);
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(nums, 0, result);
        return result;
    }
}