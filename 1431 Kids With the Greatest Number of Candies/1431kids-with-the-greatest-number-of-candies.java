class Solution {
   public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 List<Boolean> list= new ArrayList<Boolean>();
		 int max=largest(candies);
		 
		 for(int x: candies)
		 {
			 if(x+extraCandies>=max)
			 {
				 list.add(true);
			 }
			 else
			 {
				 list.add(false);
			 }
		 }
		 
		return list;
	        
	    }
	public static int largest(int[] arr) 
	    {       
	        int max = arr[0]; 
	        for (int i = 1; i < arr.length; i++)
	            if (arr[i] > max)  
	                max = arr[i]; 
	        return max; 
	    }
}