class Solution {
    int [] arr= new int[10001];
	int funtion(int n)
	{
		if(n==0) return 0;
		if(arr[n] !=-1)
		{
			return arr[n];
		}
		
		int min= Integer.MAX_VALUE;
		for(int i=1; i*i<=n; i++)
		{
			int result=1+funtion(n-i*i);
			min=Math.min(min, result);
		}
		arr[n]=min;
		return min;
	}
public int numSquares(int n) {
	Arrays.fill(arr, -1);
        return funtion(n);
    }
}