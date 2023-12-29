import java.util.Arrays;
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

public class JobSequencing {
     int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        int maxi=0;//to find the job with maximum deadline
        for(int i=0;i<arr.length;i++){
            if(arr[i].deadline>maxi){
                maxi=arr[i].deadline;
            }
            
        }
        
        
        int[] res=new int[maxi+1];
        for(int i=0;i<=maxi;i++){
            res[i]=-1;
        }
        int c=0;
        int p=0;
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(res[j] == -1){
                    res[j]=i;
                    c++;
                    p+=arr[i].profit;
                    break;
                }
                
            }
        }
        int[] ans=new int[2];
        ans[0]=c;
        ans[1]=p;
        return ans;
        
        
        
    }
    
}
