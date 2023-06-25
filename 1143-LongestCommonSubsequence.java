class Solution {
    public int longestCommonSubsequence(String X, String Y) {
        char[] x = X.toCharArray();
        char[] y = Y.toCharArray();
        int m = x.length;
        int n = y.length;
        int[][] ans = new int[m + 1][n + 1];
        
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(x[i - 1] == y[j - 1])
                    ans[i][j] = ans[i - 1][j - 1] + 1;
                else 
                    ans[i][j] = Math.max(ans[i - 1][j], ans[i][j - 1]);
            }
        }

        return ans[m][n];
    }
}
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();
    //     int[][] dp = new int[m + 1][n + 1];
        
    //     for(int i = 0; i <= m; i++) 
    //         for(int j = 0; i <= n; i++) 
    //             dp[i][j] = -1;

    //     return lcs(m, n, text1, text2, dp);
    // }

    // public int lcs(int m, int n, String s1 ,String s2, int[][] dp) {
    //     if(m == 0 || n == 0)
    //         return 0;

    //     if(dp[m][n] != -1)
    //         return dp[m][n];

    //     if(s1.charAt(m - 1) == s2.charAt(n - 1)) {
    //         return dp[m][n] = 1 + lcs(m - 1, n - 1, s1, s2, dp);
    //     } else {
    //         return dp[m][n] = Math.max(lcs(m, n - 1, s1, s2, dp), lcs(m - 1, n, s1, s2, dp));
    //     }
    // }
