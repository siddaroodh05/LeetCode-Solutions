class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left=0;
        int right=matrix[0].length*matrix.length-1;
         while(left<=right){
            int mid = left +(right-left)/2;
            int r=mid/matrix[0].length;
            int c=mid%matrix[0].length;
            if(matrix[r][c]==target)return true;
            else if (target > matrix[r][c])left=mid+1;
            else right=mid-1;
         }
         return false;
    }
}