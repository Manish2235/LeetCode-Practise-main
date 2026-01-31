class Solution {
 static Map<Character, String> map = new HashMap<>();

	void backtrack(String str, int idx, List<String> list, StringBuilder st) {
	    if (idx == str.length()) {
	        list.add(st.toString());
	        return;
	    }
	    String s = map.get(str.charAt(idx));
	    for (int i = 0; i < s.length(); i++) {
	        st.append(s.charAt(i));
	        backtrack(str, idx + 1, list, st);
	        st.deleteCharAt(st.length() - 1);
	    }
	}

	public List<String> letterCombinations(String digits) {
	    List<String> list = new ArrayList<>();
	    if (digits == null || digits.length() == 0) return list;
	    map.put('2', "abc");
	    map.put('3', "def");
	    map.put('4', "ghi");
	    map.put('5', "jkl");
	    map.put('6', "mno");
	    map.put('7', "pqrs");
	    map.put('8', "tuv");
	    map.put('9', "wxyz");

	    backtrack(digits, 0, list, new StringBuilder());
	    return list;
	}
}