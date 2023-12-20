
import java.util.*;
public class AllPermutations {

    void permutations(int[] a,ArrayList<Integer> l,List<List<Integer>> ans,boolean[] freq){
        if(l.size()==a.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!freq[i]){
                freq[i]=true;
                l.add(a[i]);
                permutations(a,l,ans,freq);
                l.remove(l.size()-1);
                freq[i]=false;


            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int[] a={1,2,3};
        boolean[] freq=new boolean[a.length];
        AllPermutations p=new  AllPermutations();
        p.permutations(a,l,ans,freq);
        System.out.println(ans);

        
    }
    
}
