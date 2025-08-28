class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) return new int[] {}; 
    Arrays.sort(changed);
    Map<Integer, Integer> freq = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    for (int num : changed) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    for (int num : changed) {
        if (freq.get(num) == 0) continue;

        int twice = num * 2;
        if (num == 0) {
            if (freq.get(num) < 2) return new int[] {}; 
            freq.put(num, freq.get(num) - 2);
            result.add(num);
        } else {
            if (!freq.containsKey(twice) || freq.get(twice) == 0) {
                return new int[] {}; 
            }
            freq.put(num, freq.get(num) - 1);
            freq.put(twice, freq.get(twice) - 1);
            result.add(num);
        }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();    
    }
}