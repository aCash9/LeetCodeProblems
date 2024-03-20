class Solution {
    public int[][] merge(int[][] it) {
        if(it.length <= 1)  return it;
        Arrays.sort(it, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        List<int[]> ans = new ArrayList<>();
        int[] curr_interval = it[0]; 
        ans.add(curr_interval);

        for(int[] interval: it) {
            int curr_st = curr_interval[0];
            int curr_end = curr_interval[1];
            int next_st = interval[0];
            int next_end = interval[1];
        
            if(curr_end >= next_st) {
                curr_interval[1] = Math.max(curr_end, next_end);
            } else {
                curr_interval = interval;
                ans.add(curr_interval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
