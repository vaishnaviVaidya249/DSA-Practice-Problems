
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=n-i-2;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
