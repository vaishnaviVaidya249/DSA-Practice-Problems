class Solution {
    public int[] shuffle(int[] nums, int n) {
    int[] ans=new int[2*n];
    //    int i=0;
    //    int j=0;
    //    while(i<n){
    //        ans[j]=nums[i];
    //        ans[j+1]=nums[i+n];
    //        i++;
    //        j+=2;

    //    }
    //    return ans;
    for(int i=0;i<nums.length;i++){
        if(i%2==0){
            ans[i]=nums[i/2];
        }else{
            ans[i]=nums[n+i/2];
        }
    }
    return ans;

    
       
    }
}
