class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i]))
                arr[0] = nums[i];
        }
        for(int i = 0; i < nums.length; i++)
            if(!set.contains(i+1))
                arr[1] = i+1;

        return arr;
    }
}
