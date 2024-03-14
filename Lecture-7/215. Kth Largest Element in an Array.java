class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
     for(int i:nums){
        pq.add(i);
     } 
     
     for(int i=0;i<k-1;i++){
        pq.remove();
     }  
     return pq.remove();
    }

    // public int findKthLargest(int[] nums, int k) {
    //     //min
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     for(int i:nums){
    //         if(pq.size()>=k && i>pq.peek())  pq.remove();
    //         if(pq.size()<k) pq.add(i);
    //     }
    //     return pq.peek();
    // }
}
