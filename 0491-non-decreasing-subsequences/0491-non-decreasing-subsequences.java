class Solution {
void backtrack(int[] nums, int i, List<Integer> list, List<List<Integer>> result) {
    if (list.size() >= 2) {
        result.add(new ArrayList<>(list));
    }

    HashSet<Integer> set = new HashSet<>();

    for (int j = i; j < nums.length; j++) {

        // avoid duplicates at same recursion level
        if (set.contains(nums[j])) continue;

        // non-decreasing check
        if (list.size() > 0 && nums[j] < list.get(list.size() - 1)) continue;

        set.add(nums[j]);
        list.add(nums[j]);

        backtrack(nums, j + 1, list, result);

        list.remove(list.size() - 1);
    }
}

public List<List<Integer>> findSubsequences(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(nums, 0, new ArrayList<>(), result);
    return result;
}
}