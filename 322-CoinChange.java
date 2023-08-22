class Solution {
    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        return coinsCh(coins, amount, map);
    }
    public int coinsCh(int[] coins, int amt, Map<Integer, Integer> map) {
        if(amt == 0)
            return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < coins.length; i++) {
            if(amt - coins[i] >= 0) {
                int subans;
                if(map.containsKey(amt - coins[i]))
                    subans = map.get(amt - coins[i]);
                else
                    subans = coinsCh(coins, amt - coins[i], map);
                if(subans + 1 < ans && subans != -1)
                    ans = subans + 1;
            } 
        }
        int fans = (ans == Integer.MAX_VALUE ? -1 : ans);
        map.put(amt, fans);
        return fans;
    }
}
