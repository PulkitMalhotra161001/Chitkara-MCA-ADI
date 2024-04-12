class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int pp = cost[0];
        int prev = cost[1];
        
        if(n<=2) return Math.min(pp,prev);
        
        for(int i=2;i<n;i++){
            int now = cost[i] + Math.min(prev,pp);
            pp = prev;
            prev = now;
        }
        
        return Math.min(prev,pp);
    }
}
