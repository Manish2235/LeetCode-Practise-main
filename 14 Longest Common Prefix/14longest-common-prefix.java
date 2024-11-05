class Solution {
    public String common(String str1, String str2)
    {
        int n= Math.min(str1.length(),str2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
            {
                sb.append(str1.charAt(i));
            }
            else
            {
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
       String res= strs[0];
       for(int i=1; i<strs.length; i++)
       {
        res=common(res, strs[i]);
       }
        return res;
    }
    
}