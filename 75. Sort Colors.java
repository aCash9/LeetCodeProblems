class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int zeroCount = 0, oneCount = 0, twoCount = 0;

        for (int num : nums) {
            switch (num) {
                case 0:
                    zeroCount++;
                    break;
                case 1:
                    oneCount++;
                    break;
                case 2:
                    twoCount++;
                    break;
            }
        }

        int i = 0;
        while (zeroCount-- > 0) {
            nums[i++] = 0;
        }

        while (oneCount-- > 0) {
            nums[i++] = 1;
        }

        while (twoCount-- > 0) {
            nums[i++] = 2;
        }
    }
}
