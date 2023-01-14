class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Sub> pq1 = new PriorityQueue<>((a,b) -> Integer.compare(b.val,a.val));
        PriorityQueue<Sub> pq2 = new PriorityQueue<>((a,b) -> Integer.compare(a.idx,b.idx));
        for(int i=0;i<n;i++) pq1.offer(new Sub(i, nums[i]));
        int[] sum = new int[k];
        while(!pq1.isEmpty() && k>0) {
            pq2.offer(pq1.poll());
            k--;
        }
        int i = 0;
        while(!pq2.isEmpty()) {
            sum[i++] = pq2.poll().val;
        }
        return sum;
    }
    class Sub {
        int idx;
        int val;
        Sub(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    } 
}
