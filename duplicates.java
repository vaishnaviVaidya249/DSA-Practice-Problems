class Solution {
    public int removeDuplicates(int[] nums) {
        // int j=1;
        // for(int i=1;i<=nums.length-1;i++){
        //     if(nums[i]!=nums[i-1]){

        //         nums[j]=nums[i];
        //         j++;
        //     }
        // }
        // return j;
        
        int j=0;
    
        for(int i=0;i<nums.length-1;i++){
             if(nums[i]!=nums[i+1]){

                 nums[j]=nums[i];
                 j++;
                 
             }
         }
         nums[j]=nums[nums.length-1];
         return j+1;



        //  int arr[]={10,13,10,26,10,26,8};
        // List<Integer> l=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     if(!l.contains(arr[i])){
        //         l.add(arr[i]);
        //     }
        // }
        // Integer[] res=new Integer[l.size()];
        // res=l.toArray(res);
        // for(int i=0;i<res.length;i++){
        //     System.out.println(res[i]);
        

            

        
    }
}