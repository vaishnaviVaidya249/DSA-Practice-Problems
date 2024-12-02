
import java.util.*;

public class CountSubarrayXorEqualsK {
    public int solve(int[] A, int B) {
        
        //Brute solution- TC:o(n2) sp:O(1)
        
        //Optimal solution : Tc:o(n) sc:o(1)
        
        int c=0;
        int prefixXor=0;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        
        for(int i=0;i<A.length;i++){
            prefixXor^=A[i];
            
            int x=prefixXor^B;
            
            if(m.containsKey(x)){
                c+=m.get(x);
            }
            
            if(m.containsKey(prefixXor)){
                m.put(prefixXor,m.get(prefixXor)+1);
            }else{
                m.put(prefixXor,1);
            }
            
        }
        
    return c;    
    }
    
}
    