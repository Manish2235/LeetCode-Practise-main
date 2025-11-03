class Solution {
    static int n;
	static int[][] t=new int[1001][1001];
 static	int solve (int [][] arr,int i, int p)
	{
	 if(i==n)
	 {
		 return 0;
	 }
	 if(p!=-1 && t[p][i]!=-1)
	 {
		 return t[p][i];
	 }
	 int take =0;
	 if(p==-1||arr[i][0]>arr[p][1])
	 {
		 take=1+solve(arr, i+1, i);
	 }
	 int skip = solve(arr, i+1, p);
	 if(p!=-1)
	 {
		 t[p][i]=Math.max(take, skip);
	 }
			return 	Math.max(take, skip);
	}
public static int findLongestChain(int[][] pairs) {
        n=pairs.length;
      //  Arrays.sort(pairs);
        for (int[] row : t) {
     	    Arrays.fill(row, -1);
     	}
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] row : pairs) {
            System.out.println(Arrays.toString(row));
        }

        return solve(pairs,0,-1);
    }
}