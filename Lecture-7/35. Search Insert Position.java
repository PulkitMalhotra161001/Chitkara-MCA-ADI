class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = n-1;
        while(s <= e){
            int mid = (e-s)/2 + s;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return s;
    }
}
