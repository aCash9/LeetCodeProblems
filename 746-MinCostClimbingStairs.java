class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if(n == 2)
            return Math.min(cost[0], cost[1]);

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = cost[0];
        for(int i = 1; i < n; i++) {
            dp[i + 1] = cost[i] + Math.min(dp[i], dp[i - 1]);
        }

        return Math.min(dp[n], dp[n - 1]);
    }
}
        // dp[n] = 0;
        // dp[n - 1] = cost[n - 1];
        // for(int i = n - 2; i >= 0; i--) {
        //     dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]); 
        // }
        // return Math.min(dp[0], dp[1]);
