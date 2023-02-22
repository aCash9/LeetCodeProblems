class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new LinkedList<>();
        if(nums.length == 0)
            return ranges;
        String str = Integer.toString(nums[0]);
        int start_index = 0, last_index = 0;
        for(int i = 1; i < nums.length; i++){
                if(nums[i] - nums[last_index] == 1){
                    last_index = i;
                }else {
                    if(last_index - start_index == 0){
                        str = Integer.toString(nums[start_index]);
                        ranges.add(str);
                    }else{ 
                        str = Integer.toString(nums[start_index]) + "->" + Integer.toString(nums[last_index]);
                        ranges.add(str);
                    }
                    start_index = i;
                    last_index = i;
                }
        }
        if(last_index - start_index == 0){
            str = Integer.toString(nums[start_index]);
            ranges.add(str);
        }else{ 
            str = Integer.toString(nums[start_index]) + "->" + Integer.toString(nums[last_index]);
            ranges.add(str);
        }
        return ranges;
    }
}
