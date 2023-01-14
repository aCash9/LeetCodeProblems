class Solution {
    public static int minimumOperations(int[] nums) {
        //answer is basically number of non-zero numbers
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            if(i != 0)  set.add(i);
        return set.size();
    }
}
