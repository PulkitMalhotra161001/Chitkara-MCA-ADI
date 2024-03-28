class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(n<k) return new int[0];
        
        int ans[] = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[ dq.peekLast() ]<= nums[i]){
                dq.removeLast();
            }
            
            dq.addLast(i);
        }
        
        ans[0] = nums[ dq.peekFirst() ];
        
        for(int i=k;i<n;i++){
            
            //remove out of window element
            if(dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            
            //include current element
            //in decreasing order
            while(!dq.isEmpty() && nums[ dq.peekLast() ]< nums[i]){
                dq.removeLast();
            }
            
            //add
            dq.addLast(i);
            
            // System.out.println(dq);
            //  i=k-1
//             put=0
            //k=3
            //i=2
            ans[i-k+1] = nums[ dq.peekFirst() ];
            
            
        }
        
        
        return ans;
    }
}