class Solution {
    public int[] findEvenNumbers(int[] digits) {
  List<Integer> result=new ArrayList<Integer>(); 
        int[] arr=new int[10];
       for(int x: digits)
       {
    	   arr[x]++;
       }
        for(int i=1; i<=9; i++) {
        	if(arr[i]==0)
        	{
        		continue;
        	}
        	arr[i]--;
        	for(int j=0; j<=9; j++)
        	{
        		if(arr[j]==0)
            	{
            		continue;
            	}
        		arr[j]--;
        		for(int k=0; k<=8; k+=2 )
        		{
        			if(arr[k]==0)
                	{
                		continue;
                	}
        			arr[k]--;
        			result.add(i*100+j*10+k*1);
        			arr[k]++;
        		}
        		arr[j]++;
        	}
        	arr[i]++;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}