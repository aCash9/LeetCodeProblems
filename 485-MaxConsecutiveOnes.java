class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int freq = 0, maxFreq = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)
                freq++;
            else {
                maxFreq = Math.max(maxFreq, freq);
                freq = 0;
            }
        }
        maxFreq = Math.max(maxFreq, freq);
        return maxFreq;
    }
}
