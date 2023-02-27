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
// better solution
public int[] findErrorNums(int[] nums) {
        int[] index = new int[nums.length + 1];
        Arrays.fill(index, 0);
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            index[nums[i]]++; 
            if(index[nums[i]] > 1)
                arr[0] = nums[i];
        } 
        for(int i = 1; i < index.length; i++)
            if(index[i] == 0){
                arr[1] = i;
                break;
            }
        return arr;
    }
