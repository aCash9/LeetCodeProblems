class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int low = 0;
        int high = (col * matrix.length) - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;
            int i = mid / col;
            int j = mid % col;

            if(matrix[i][j] == target) return true;

            if(target < matrix[i][j])   high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
