import java.util.*;
public class SubSet2 {

    void findSubsets(int index,int[] nums,List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            findSubsets(index+1,nums,list,ans);
            list.remove(list.size()-1);
        }
       

    }
    public static void main(String[] args) {
        SubSet2 s=new SubSet2();
        int[] nums={1,2,2,2,3,3};
        ArrayList<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        s.findSubsets(0,nums,list,ans);
        System.out.println(ans);
        
    }
    
}
