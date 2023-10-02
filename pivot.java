class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int j=0;j<n;j++){
            s+=nums[j];
        }
        int ls=0;
        int rs=s;
        for(int i=0;i<n;i++){
            rs-=nums[i];
            if(rs==ls){
                return i;
            }
            ls+=nums[i];
            

        }
        return -1;
    
    
        // for(int i=0;i<nums.length;i++){
        //     int ls=0;
        //     for(int j=0;j<i;j++){
        //         ls+=nums[j];
        //     }
        //     int rs=0;
        //     for(int k=i+1;k<nums.length;k++){
            
        //         rs+=nums[k];
        //     }
        //     if(ls==rs){
        //         return i;
        //     }
            
        // }
        // return -1;
        
        
    }
}
