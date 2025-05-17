class Solution {
    public String reverseWords(String s) {
		String[] st=s.split("\\s+");
		int  left=0;
		int right=st.length-1;
		while(left<right)
		{
		String	temp=st[left];
			st[left]=st[right];
			st[right]=temp;
			left++;
			right--;
		}
		StringBuilder str= new StringBuilder();
		for(String x: st)
		{
			str.append(x);
			str.append(" ");
		}
		return str.toString().trim(); 
    }
}