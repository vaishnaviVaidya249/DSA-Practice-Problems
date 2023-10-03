
class Solution {

    void printTriangle(int n) {
        int s=1;
        for(int i=1;i<=n;i++){
        
            for(int j=1;j<=i;j++){
                System.out.print(s+" ");
                
                s=s+1;
                
            }
            System.out.print("\n");
            
        }
    }
}