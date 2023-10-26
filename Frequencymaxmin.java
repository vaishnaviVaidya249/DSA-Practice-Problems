import java.util.HashMap;
import java.util.Map;

public class Frequencymaxmin {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<v.length;i++){
            if(map.containsKey(v[i])){
                map.put(v[i],map.get(v[i])+1);

            }else{
                map.put(v[i],1);

            }
        }
        int maxf=0;
        int minf=v.length;
        int maxe=0;
        int mine=0;
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            int c=it.getValue();
            int e=it.getKey();
            if(c>maxf||(c==maxf && e<maxe)){
                maxe=e;
                maxf=c;
            }
            if(c<minf || (c==minf && e<mine)){
                mine=e;
                minf=c;
            }
        }
       
        
        res[0]=maxe;
        res[1]=mine;
        return res;
    }
        
        

    
    
}
