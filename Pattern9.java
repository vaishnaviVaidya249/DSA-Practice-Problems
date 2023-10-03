class Solution {

    void printDiamond(int n) {
        // Your code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
                
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
        
       
    }
}
