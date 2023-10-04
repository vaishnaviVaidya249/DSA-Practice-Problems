class Solution {

    void printTriangle(int n) {
        // code here

        for(int i=0;i<n;i++){
            //  char c='A';
        
            for(int j=0;j<=i;j++){
                // System.out.print(c);
                // c++;
                int num=65+j;
                System.out.print((char)num);
                
                
            }
            System.out.print("\n");
        }
    }
}