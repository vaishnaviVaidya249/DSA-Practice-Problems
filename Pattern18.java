class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                int num=65+n-1-j;
                System.out.print((char)num+" ");
                
            }
            System.out.print("\n");
        }
    }
}