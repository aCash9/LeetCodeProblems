class Solution {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> map = new HashMap<>();
        String[] str = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            map.put(score[i],i);
            q.add(score[i]);
        }
        int pos = 1;
        while(!q.isEmpty()){
            int item = q.poll();
            int index = map.get(item);
            if(pos==1)  str[index] = "Gold Medal";
            else if(pos==2)  str[index] = "Silver Medal";
            else if(pos==3)  str[index] = "Bronze Medal";
            else str[index] = String.valueOf(pos);
            pos++;
        }
        return str;
    }
}
