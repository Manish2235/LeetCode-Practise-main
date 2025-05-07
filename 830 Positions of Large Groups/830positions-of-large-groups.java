class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result =new ArrayList<>();
	int i=0;
	int n=s.length();
	while (i < n) {
        int j = i;
        while (j < n && s.charAt(j) == s.charAt(i)) {
            j++;
        }
        if (j - i >= 3) {
            result.add(Arrays.asList(i, j - 1));
        }
        i = j;
    }
	return result; 
    }
}