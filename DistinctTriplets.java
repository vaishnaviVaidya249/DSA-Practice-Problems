import java.util.*;
public class DistinctTriplets {
    public static void main(String[] args) {
        
    
    int[] arr={3,3,4,7,8};
    int d=5;
    List<List<Integer>> res=new ArrayList<>();
       
    for(int i=0;i<arr.length-2;i++){
        for(int j=i+1;j<arr.length-1;j++){
            for(int k=j+1;k<arr.length;k++){
                if((arr[i]+arr[j]+arr[k])%d==0){
                    ArrayList<Integer> l=new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    l.add(k);
                    Collections.sort(l);
                    if(!res.contains(l)){
                        res.add(l);
                    }
                }
                    
            }
        }
            
    }
    System.out.println(res.size());
}
    
}
