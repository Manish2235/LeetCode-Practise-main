class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
	int n=mat[0].length;
	List<Integer> result= new ArrayList();
    Map<Integer, List> map= new HashMap<>(); 
    for(int i=0; i<m; i++)
    {
    	for(int j=0; j<n; j++)
    	{
    		map.computeIfAbsent(i+j,  k->new ArrayList<>()).add(mat[i][j]);
    	}
    }   
    boolean flag= true;
    for (Map.Entry<Integer,List> v : map.entrySet()) 
    {
    	List<Integer> list = new ArrayList<>(v.getValue()); 
        if (flag) {
            Collections.reverse(list);
        }
        result.addAll(list);
        flag = !flag; 	
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
    }
}