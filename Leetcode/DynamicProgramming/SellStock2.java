class Solution {
    
        public int maxProfit(int[] prices) {
        return helper(prices, 0, false, new HashMap<>());
    }
    
    private int helper(int[] prices, int idx, boolean holdingStock, Map<String, Integer> cache) {
        if (idx >= prices.length) return 0;
        String key = holdingStock + " " + idx;
        if (cache.containsKey(key)) return cache.get(key);
        int res;
        if (holdingStock) {
            // either sell or keep
            int keep = helper(prices, idx + 1, true, cache);
            int sell = prices[idx] + helper(prices, idx + 2, false, cache);
            res = Math.max(keep, sell);
        } else {
            // either buy or wait
            int wait = helper(prices, idx + 1, false, cache);
            int buy =  helper(prices, idx + 1, true, cache) - prices[idx];
            res = Math.max(wait, buy);
        }
        
        cache.put(key, res);
        return res;
   
    }
}
