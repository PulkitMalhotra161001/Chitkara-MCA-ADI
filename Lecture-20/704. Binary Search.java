class Solution {
    public int search(int[] nums, int target) {
        // return iterative(nums,target);
        
        return recursive(0,nums.length-1,nums,target);
    }
    
    public int recursive(int l,int r,int nums[],int target){
        
        //base case
        if(l>r) return -1;
        
        int mid = l+(r-l)/2;
        if(nums[mid]==target)   return mid;
        
        
        else if(nums[mid]<target)   return recursive(mid+1,r,nums,target);
        return recursive(l,mid-1,nums,target);
    }
    
    public int iterative(int nums[],int target){
        int n=nums.length, l=0, r=n-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(nums[mid]==target)   return mid;
            else if(nums[mid]<target)   l=mid+1;
            else    r=mid-1;
        }
        
        return -1;
    }
}
