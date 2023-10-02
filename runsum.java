class Solution {
    public int[] runningSum(int[] nums) {
        int runsum=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
           runsum+=nums[i];
           nums[i]=runsum;
       }
       return nums;
        
    }
}