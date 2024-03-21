class Solution {
    public void rotate(int[][] A) {
        int N = A.length;
        //transpose
        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        //reverse
        for (int i=0; i<N; i++) {
            for (int j=0; j<(N/2); j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N-1-j];
                A[i][N-1-j] = temp;
            }
        }
    }
}
