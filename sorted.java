class Solution {
    public int[] sortedSquares(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         nums[i]=nums[i]*nums[i];
    //     }
    //     Arrays.sort(nums);
    //     return nums;

        
    // }
    int n=nums.length;
    int lp=0;
    int rp=n-1;
    int[] result=new int[n];
    int v=n-1;
    while(lp<=rp){
        if(Math.abs(nums[lp])<=Math.abs(nums[rp])){
            result[v]=nums[rp]*nums[rp];
            rp--;
            v--;
        }else{
            result[v]=nums[lp]*nums[lp];
            lp++;
            v--;
        }
    
    }
    return result;
    }
    
    

}