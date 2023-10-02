class Solution {
    public int majorityElement(int[] nums) {
        int c=1;
        int me=0;
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];

        // if(n==1){
        //     return nums[0];
        // }else{
        //     for(int i=0;i<n-1;i++){
        //         if(nums[i]==nums[i+1]){
        //             c+=1;
        //             me=nums[i];
        //             if(c>n/2){
        //                 break;
        //             }
        //         }
        //     }
        //     return me;
        // }
        
        

    
       

        
    }

}