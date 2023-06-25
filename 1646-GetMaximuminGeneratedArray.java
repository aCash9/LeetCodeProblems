class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        int[] ans = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 2; i <= n; i++) {
            if((i & 1) != 1) {
                ans[i] = ans[i/2];
            } else {
                ans[i] = ans[i/2] + ans[i/2 + 1];
            }
            if(ans[i] > max)
                max = ans[i];
        }
        return max;
    }
}
