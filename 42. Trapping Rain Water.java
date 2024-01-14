class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] l_max = new int[n];
        int[] r_max = new int[n];

        l_max[0] = h[0];
        r_max[n - 1] = h[n - 1];
        for(int i = 1; i < n; i++) {
            if(l_max[i - 1] > h[i])
                l_max[i] = l_max[i - 1];
            else 
                l_max[i] = h[i];
        }
        for(int i = n -2; i >= 0; i--) {
            if(r_max[i + 1] > h[i])
                r_max[i] = r_max[i + 1];
            else 
                r_max[i] = h[i];
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int diff = Math.min(l_max[i], r_max[i]) - h[i];

            trappedWater += diff;
        }

        return trappedWater;
    }
}
