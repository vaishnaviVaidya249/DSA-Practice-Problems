import java.util.ArrayList;

public class DFS {
    public static void dfs(int node,boolean vis[],ArrayList<Integer> ls,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,ls,adj);
            }
        }
        
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis=new boolean[V];
        int node=0;
        ArrayList<Integer> ls=new ArrayList<>();
        dfs(node,vis,ls,adj);
        return ls;
        
        
        
    
       
        
        
    }
    
}
