class Solution {
    public int subarraySum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            currSum += nums[i]; 
            if(map.containsKey(currSum - goal)) {
                count += map.get(currSum - goal);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
