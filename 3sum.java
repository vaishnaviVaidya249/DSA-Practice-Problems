class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> r=new HashSet<>();

        
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    r.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(r);

        //time complexity:o(n2)
        
        
        

        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length-1;j++){
        //         for(int k=j+1;k<nums.length-1;k++){
        //             if(i!=j && i!=k && j!=k){
        //                 if(nums[i]+nums[j]+nums[k]==0){
        //                     List<Integer> t=new ArrayList<>();
        //                     t.add(nums[i]);
        //                     t.add(nums[j]);
        //                     t.add(nums[k]);
        //                     Collections.sort(t);
        //                     if(!r.contains(t)){
        //                         r.add(t);
        //                     }

        //                 }
        //             }

        //         }
        //     }
        // }
        // return r;
        
    }
}