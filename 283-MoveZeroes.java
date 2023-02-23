class Solution {
    public static void moveZeroes(int[] nums) {
        int l = nums.length;
        int[] dup = new int[l];
        int start = 0, end = l - 1;
        for (int i = 0; start <= end; i++) {
            if (nums[i] == 0)
                dup[end--] = 0;
            else
                dup[start++] = nums[i];
        }
        for (int i = 0; i < l; i++) {
            nums[i] = dup[i];
        }
    }
}
