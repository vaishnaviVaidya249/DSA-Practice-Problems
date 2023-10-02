class Solution {

    void printTriangle(int n) {
        // code here
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     System.out.print("\n");
        // }
        for(int i=1;i<=n;i++){
            for(int k=i;k<n;k++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=(2*i)-1;j++){

                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}