class Solution {
    public int deleteAndEarn(int[] nums) {
        int occ[] = findFreq(nums);
        
        for(int i:occ){
            System.out.print(i+" ");
        }
        
        return usingDP(occ);
        // return optimize(occ);
    }
    
    public int optimize(int nums[]){
        
        int pp=0, p=0;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            int now = Math.max(p, i*nums[i] + pp);
            pp=p;
            p=now;
        }
        return p;
    }    
    public int usingDP(int nums[]){
        
        int n=nums.length;
        int dp[] = new int[n];
        
        dp[1] = nums[1];
        
        for(int i=2;i<n;i++){
            
            //or we use all occ of i number (number * it's occ) will give current value
            dp[i] = Math.max(dp[i-1], dp[i-2] + i*nums[i]);
            
        }
        
        return dp[n-1];
    }
    
    public int[] findFreq(int nums[]){
        int max=0;
        for(int i:nums) max = Math.max(max, i);
        
        int occ[] = new int[max+1];
        for(int i:nums){
            occ[i]++;
        }
        
        return occ;
    }
}
