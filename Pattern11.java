
class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i%2==0 && j%2==0){
                    System.out.print(1+" ");
                     
                }else if(i%2==0 && j%2!=0){
                    System.out.print(0+" ");
                }else if(i%2!=0 && j%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
                
            }
            System.out.print("\n");
        }
    }
}