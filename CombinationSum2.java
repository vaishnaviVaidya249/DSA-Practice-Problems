import java.util.*;
public class CombinationSum2 {

      void combinationSum2(int index,int[] arr,int target,ArrayList<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            
            list.add(arr[i]);
            combinationSum2(i+1,arr,target-arr[i],list,ans);
            list.remove(list.size()-1);

        }
    }
    
    public static void main(String[] args) {
        CombinationSum2 cs2=new CombinationSum2();
        int[] arr={1,1,2,5,6,7,10};
        
        int target=8;
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        cs2.combinationSum2(0,arr,target,list,ans);
        for (List<Integer> combination : ans) {
            System.out.println(combination);
        }
        
    }
    
}
