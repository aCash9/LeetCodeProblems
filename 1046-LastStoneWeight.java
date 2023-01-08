class Solution {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            q.add(stones[i]);
        }
        while (q.size() != 1 && q.size() != 0) {
            int x = q.poll();
            int y = q.poll();
            if (y <= x) {
                if (x != y) {
                    q.add(x-y);
                }
                else if( x != y){
                    q.add(y-x);
                }
            }
        }
        if(q.isEmpty()){
            return 0;
        }
        return q.poll();
    }
}
