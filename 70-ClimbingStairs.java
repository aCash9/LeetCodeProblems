class Solution {
    public int climbStairs(int n) {
        int[] ans = new int[n + 1];
        Arrays.fill(ans ,-1);
        return helper(n, ans);
    }

    public int helper(int n, int[] ans) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;

        if(ans[n] != -1)
            return ans[n];

        int p1=helper(n-1, ans);
        ans[n-1] = p1;
        int p2=helper(n-2, ans);
        ans[n-2] = p2;
        
        return ans[n] = p1+p2;
    }

}
