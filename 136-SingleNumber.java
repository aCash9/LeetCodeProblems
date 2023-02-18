class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }       
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() == 1)
                return e.getKey();
        }
        return 1;
    }
}
// better solution
class Solution {
    public int singleNumber(int[] nums) {
        int bit = 0;
        for(int i = 0; i< nums.length; i++)
            bit ^= nums[i];

        return bit;
    }
}
