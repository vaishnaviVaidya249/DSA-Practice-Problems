class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int temp=0;
        int temp2=0;
       
        for(int i=0;i<n-1;i++){
            if(nums[i]==0){
                if(nums[i+1]!=0){
                    temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }else{
                    for(int j=i+2;j<n;j++){
                        if(nums[j]!=0){
                            temp2=nums[j];
                            nums[j]=nums[i];
                            nums[i]=temp2;
                            break;
                        }
                    }
                }
                
            }
         

        }
        
        
    }
}