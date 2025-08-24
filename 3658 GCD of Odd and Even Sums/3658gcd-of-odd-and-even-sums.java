class Solution {
    public int GCD(int n, int m)
	{
		int result = Math.min(n, m);
        while (result > 0) {
            if (n % result == 0 && m % result == 0) {
                break;
            }
            result--;
        }
        return result;
	}
public int gcdOfOddEvenSums(int n) {
	int sumodd=0;
	int sumeven=0;
	int count =0;
	int num=1;
	while(count<n)
	{
		if(num%2==0)
		{
			sumeven=sumeven+num;			
			num++;
			count++;
			continue;
		}
		else
		{
			sumodd=sumodd+num;
			num++;
		}
		
	}   
    return GCD(sumodd, sumeven);
    }
}