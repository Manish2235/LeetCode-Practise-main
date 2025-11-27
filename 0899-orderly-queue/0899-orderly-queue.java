class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1)
        {
            char[] char_array = s.toCharArray();
java.util.Arrays.sort(char_array);
String sorted_string = new String(char_array);
return sorted_string;
        }
        else
        {
            String result=s;
            int n=s.length();
            for(int l=1; l<=n-1; l++)
            {
                String temp= s.substring(l)+s.substring(0,l);
                result = (result.compareTo(temp) < 0) ? result : temp;
            }
            return result;
        }
    }
}