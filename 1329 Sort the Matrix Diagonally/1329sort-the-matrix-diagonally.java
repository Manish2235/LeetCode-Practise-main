class Solution {
    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, List> map = new HashMap();
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
				map.computeIfAbsent(i-j,  k->new ArrayList<>()).add(mat[i][j]);
		}
	}
	for(Map.Entry<Integer, List> a: map.entrySet())
	{
		Integer key = a.getKey();                 // key
	    List list = a.getValue();
	    list.sort(Comparator.naturalOrder());
	}
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
			mat[i][j]=(int) map.get(i-j).removeFirst();
		}
	}
	return mat;
    }
}