import java.util.ArrayList;

public class LeaderEle {
    ArrayList<Integer> leaders=new ArrayList<>();
        int maxi=0;
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            if(a[i]>maxi){
                maxi=a[i];
                leaders.add(maxi);
            }
        }
        Collections.sort(leaders);
        return leaders;
    
}
