import java.util.ArrayList;
import java.util.Collections;

class meeting implements Comparable<meeting>{
    int start;
    int end;
    int pos;
    
    meeting(int start, int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
    @Override
    public int compareTo(meeting m){
        return this.end-m.end;
    }
    
    
    
}

public class Nmeetings {
    public static int maxMeetings(int start[], int end[], int n)
    {
    ArrayList<meeting> a=new ArrayList<>();
        
        for(int i=0;i<start.length;i++)
            a.add(new meeting(start[i],end[i],i+1));
        
           
        Collections.sort(a);
            
            
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(a.get(0).pos);
        int limit=a.get(0).end;
            
        for(int i=1;i<start.length;i++){
            if(a.get(i).start > limit){
                ans.add(a.get(i).pos);
                limit=a.get(i).end;
            }
        }
        return ans.size();
            
            
        
    }
    
}
//tc: o(nlogn)+o(n)+o(n)=o(nlogn)
//sc: o(n)
