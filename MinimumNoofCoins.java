import java.util.ArrayList;
import java.util.List;

public class MinimumNoofCoins {
    static List<Integer> minPartition(int N)
    {
        // code here
        int[] a={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 } ;
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int i=a.length-1;i>=0;i--){
            while(N>=a[i]){
                N-=a[i];
                res.add(a[i]);
                
            }
            
        }
        return res;
        
      
    }
    
}
