class Solution {
    public int[][] generateMatrix(int n) {
             int j=1;
		 int[][] arr= new int[n][n];
		 int dir = 0;
		 int top = 0, down = n - 1, left = 0, right = n - 1;
		 while(top<=down&& left<=right)
		 {
			 if (dir == 0) { 
			        for (int i = left; i <= right; i++) {
			            arr[top][i]=j;
			            j++;
			        }
			        top++;
			    } else if (dir == 1) { 
			    	System.out.println(arr[0][0]);
			        for (int i = top; i <= down; i++) {
			        	arr[i][right]=j;
			            j++;
			        }
			        right--;
			    } else if (dir == 2) { 
			        for (int i = right; i >= left; i--) {
			        	arr[down][i]=j;
			            j++;
			        }
			        down--;
			    } else if (dir == 3) {
			        for (int i = down; i >= top; i--) {
			        	arr[i][left]=j;
			            j++;
			        }
			        left++;
			    }
			    dir = (dir + 1) % 4;
		 }
		 
		return arr;
    }
}