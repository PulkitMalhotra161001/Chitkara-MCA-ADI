class Solution {
    public int removeElement(int[] nums, int val) {
        int x =0, n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != val){
                nums[x++] = nums[i];
            }
        }
        return x;
    }
}
