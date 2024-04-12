class Solution {
    Integer dp[];
    public int climbStairs(int n) {
        dp = new Integer[n+1];
        // Arrays.fill(dp,-1);
        
        // return memo(n);
        
        return tab(n);
    }
    
    int memo(int n){
        //base case
        if(n<3)    return n;
        if(dp[n]!=null)   return dp[n];
        
        //rec calls
        dp[n] = memo(n-1) + memo(n-2);
        return dp[n];
    }
    int tab(int n){
        if(n<3)    return n;
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
    int opt(int n){
        if(n<3) return n;
        
        int pp=1;
        int p=2;
        int now;
        for(int i=3;i<=n;i++){
            now = p + pp;
            
            pp=p;
            p=now;
        }
        
        return p;
    }
}
