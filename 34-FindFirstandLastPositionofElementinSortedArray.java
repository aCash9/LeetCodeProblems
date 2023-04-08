class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        int l = nums.length;
        if(l == 1){
            if(nums[0] == target){
                range[0] = 0;
                range[1] = 0;
                return range;
            }
            return range;
        }
        int low = 0, high = l - 1, mid;
        int start, end;
        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid] == target){
                start = mid;
                end = mid;
                while((start - 1 >= 0) && nums[start - 1] == target)
                    start--;
                while((end + 1 <= l - 1) && nums[end + 1] == target)
                    end++;
                range[0] = start;
                range[1] = end;
                return range;
            } 
            if(nums[mid] > target)
                high = mid - 1;
            if(nums[mid] < target)
                low = mid + 1;
        }
        return range;
    }
}
