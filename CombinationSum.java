import java.util.*;
public class CombinationSum {

     List<List<Integer>> findCombinations(int index, int[] arr,int target,List<List<Integer>> ans,ArrayList<Integer> ds,int n){
        if(index==n){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return ans;
        }

        if(arr[index]<=target){
            ds.add(arr[index]);
            findCombinations(index,arr,target-arr[index],ans,ds,n);
            ds.remove(ds.size()-1);
        }
        return findCombinations(index+1,arr,target,ans,ds,n);
    }
    public static void main(String[] args) {
        CombinationSum cs=new CombinationSum();
        int[] arr={2,3,6,7};
        int target=7;
        int n=arr.length;
        ArrayList<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        System.out.println(cs.findCombinations(0,arr,target,ans,ds,n));
        
    }
    
}
