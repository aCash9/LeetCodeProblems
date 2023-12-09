class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length + 1;
        int[] freq = new int[n];
        for(int num: nums) {
            freq[num]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < n; i++){
            if(freq[i] > 1)
                list.add(i);
        }
        return list;
    }
}
