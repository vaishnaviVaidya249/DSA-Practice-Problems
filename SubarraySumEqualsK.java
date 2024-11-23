class Solution {
    public int subarraySum(int[] nums, int k) {
        int preSum=0,c=0;

        //here we use prefix sum approach

        
        Map<Integer,Integer> m=new HashMap();
        m.put(0,1);

        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int remove=preSum-k;
            c+=m.getOrDefault(remove,0);
            m.put(preSum,m.getOrDefault(preSum,0)+1);
            
        }
        return c;

//         int l=nums.length;
//         int c=0;


// //o(n)2 time complexity and o(1) space complexity-- Brute Force solution
//         for(int i=0;i<l;i++){
//             int sum=nums[i];
//             if(sum==k){
//                 c++;     
//             }
//             for(int j=i+1;j<l;j++){
//                         sum+=nums[j];
//                         if(sum==k){
//                             c++;
//                         }
//                 }
//         }
//         return c; 

    }
}
