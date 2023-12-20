import java.util.*;
public class AllPermutations2 {
    void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;


    }

    void Permutations2(int[] arr,int i,List<List<Integer>> ans){
        
        if(i==arr.length){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                list.add(arr[j]);
            }
            ans.add(list);
            return;
        }
        for(int ind=i;ind<arr.length;ind++){
            swap(ind,i,arr);
            Permutations2(arr,i+1,ans);
            swap(ind,i,arr);
            
        }
        

    }
    
    public static void main(String[] args) {
        AllPermutations2 p2=new AllPermutations2();
        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        p2.Permutations2(arr,0,ans);
        System.out.println(ans);

        
    }
    
}
