class Solution {
    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            q.add(nums[i]);
        }
        int x = q.poll()-1;
        int y = q.poll()-1;
        return x*y;
    }
}
