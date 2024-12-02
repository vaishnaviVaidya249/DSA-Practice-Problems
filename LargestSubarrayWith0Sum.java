import java.util.*;

class Solution {
    int maxLen(int arr[]) {
        // code here
        
        int sum=0;
        int maxi=0;
        
        HashMap<Integer,Integer> m=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
                
            }else if(m.get(sum)!=null){
                maxi=Math.max(maxi,i-m.get(sum));
                
            }else{
                m.put(sum,i);
            }
        }
        return maxi;
    
        
    }
}