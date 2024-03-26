class Solution {
    public int[] rearrangeArray(int[] a) {
        int[] ans = new int[a.length];

        int eindex = 0;
        int oindex = 1;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > 0) {
                ans[eindex] = a[i];
                eindex += 2;
            } else {
                ans[oindex] = a[i];
                oindex += 2;
            }
        }

        return ans;
    }
}
